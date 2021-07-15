//leetcode 380
import java.util.*;
class RandomizedSet {
	LinkedList<Integer>[] buckets;
	int size;
	void initializeBuckets(int N) {
		buckets = new LinkedList[N];
		for (int i = 0; i < N; i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	/** Initialize your data structure here. */
	public RandomizedSet() {
		initializeBuckets(4);
	}

	void rehash() {
		LinkedList<Integer>[] ol = buckets;
		initializeBuckets(buckets.length * 2);
		for (int i = 0; i < ol.length; i++) {
			for (int v : ol[i]) {
				this.insert(i);
			}
		}
	}

	int hashFunc(Integer n) {
		int hc = n.hashCode();
		return Math.abs(hc) % buckets.length;
	}

	int getIdx(int n, int bi) {
		int di = 0;
		for (int i : buckets[bi]) {
			if (i == n) {
				return di;
			}
			di++;
		}
		return -1;
	}

	/** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	public boolean insert(int val) {
		int bi = hashFunc(val);
		int di = getIdx(val, bi);

		if (di == -1) {
			buckets[bi].add(val);
		}

		double lambda = this.size * 1.0 / buckets.length;
		if (lambda > 2.0) {
			rehash();
		}

		return di == -1;
	}

	/** Removes a value from the set. Returns true if the set contained the specified element. */
	public boolean remove(int val) {
		int bi = hashFunc(val);
		int di = getIdx(val, bi);
		if (di != -1) {
			buckets[bi].remove(di);
			return true;
		} else {
			return false;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random rand = new Random();
		int bi = rand.nextInt(buckets.length);
		while (buckets[bi].size() == 0) {
			bi = rand.nextInt(buckets.length);
		}
		int di = rand.nextInt(buckets[bi].size());
		return buckets[bi].get(di);
	}
}