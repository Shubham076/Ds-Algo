package hashtable;

import hashtable.linkedlist;

public class Hashtable<K,V> {

	private class HTPair {
		K key;
		V value;

		public HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object obj) {
			HTPair op = (HTPair) obj;
			return this.key.equals(op.key);
		}

		public String toString() {
			return "{" + this.key + ":" + this.value + "}";
		}
	}

	public static final int DEFAULT_CAPACITY = 10;
	private linkedlist<HTPair>[] bucketArray;
	private int size;

	public Hashtable() {
		this(DEFAULT_CAPACITY);
	}

	public Hashtable(int capacity) {
		this.bucketArray = (linkedlist<HTPair>[]) new linkedlist[capacity];
		this.size = 0;
	}

	public void put(K key, V value) throws Exception {
		int bi = this.hashFunction(key);
		linkedlist<HTPair> bucket = this.bucketArray[bi];
		HTPair pta = new HTPair(key, value);
		if (bucket == null) {
			bucket = new linkedlist<>();
			bucket.addlast(pta);
			this.size++;
			this.bucketArray[bi] = bucket;
		} else {
			int foundAt = bucket.find(pta);
			if (foundAt == -1) {
				bucket.addlast(pta);
				this.size++;
			} else {
				HTPair pair = bucket.getat(foundAt);
				pair.value = value;
			}
		}

		double lamda = (this.size * 1.0) / this.bucketArray.length;
		if (lamda > 0.75) {
			this.rehash();
		}
	}

	private int hashFunction(K key) {
		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		return bi;
	}

	public void display()
	{
		for(linkedlist<HTPair> bucket:bucketArray)
		{
			if(bucket!=null&&!bucket.isempty())
			{
				bucket.display();
			}
			else System.out.println("NULL");
		}
		System.out.println("-----------------");
	}
	

	

	public V get(K key) throws Exception {
		int bi = this.hashFunction(key);
		linkedlist<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int foundAt = bucket.find(ptf);
			if (foundAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(foundAt);
				return pair.value;
			}
		}
	}

	public V remove(K key) throws Exception {
		int bi = this.hashFunction(key);
		linkedlist<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int foundAt = bucket.find(ptf);
			if (foundAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getat(foundAt);
				bucket.removeat(foundAt);
				this.size--;
				return pair.value;
			}
		}
	}

	private void rehash() throws Exception {
		linkedlist<HTPair>[] oba = this.bucketArray;
		this.bucketArray = (linkedlist<HTPair>[]) new linkedlist[2 * oba.length];
		this.size = 0;
		for (linkedlist<HTPair> ob : oba) {
			while (ob != null && !ob.isempty()) {
				HTPair rp = ob.removeatfirst();
				this.put(rp.key, rp.value);
			}
		}
	}

}