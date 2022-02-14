import java.util.LinkedList;
import java.util.ArrayList;
class HashMap <K , V>{
	private class HMNode{
		K key;
		V val;
		public HMNode(K key , V val){
			this.key = key;
			this.val = val;
		}
	}

	private int size;
	private LinkedList<HMNode>[] buckets;  // N

	private void initBuckets(int N){
		buckets = new LinkedList[N];
		for(int i = 0; i < N; i++){
			buckets[i] = new LinkedList<>();
		}
	}

	public HashMap(){
		this.size = 0; // n
		initBuckets(4);
	}

	private int hashFn(K key){
		int hc = key.hashCode();
		return Math.abs(hc) % buckets.length;
	}

	//bi = bucket index
	private int getIdxWithinBucket(K key , int bi){
		int di = 0;
		for(HMNode node : this.buckets[bi]){
			if(node.key.equals(key)){
				return di;
			}
			di++;
		}
		return -1;
	}

	private void rehash() throws Exception{
		//ol
		LinkedList<HMNode>[] ol = buckets;
		initBuckets(ol.length * 2);

		for(int i = 0 ; i < ol.length; i++){
			for(HMNode n : ol[i]){
				this.put(n.key , n.val);
			}
		}
	}

	public void put(K key , V val) throws Exception{
		int bi = hashFn(key);
		int di = getIdxWithinBucket(key , bi);
		if(di == -1){
			HMNode node = new HMNode(key, val);
			buckets[bi].add(node);
			this.size++;
		}
		else{
			HMNode node = buckets[bi].get(di);
			node.val = val;			
		}

		double lambda = this.size * 1.0 / buckets.length;
		if(lambda > 2.0){
			rehash();
		}
	}

	public boolean containsKey(K key){
		int bi = hashFn(key);
		int di = getIdxWithinBucket(key , bi);
		if(di == -1){
			return false;
		}
		else{
			return true;			
		}
	}

	public V get(K key) throws Exception{
		int bi = hashFn(key);
		int di = getIdxWithinBucket(key , bi);
		if(di == -1){
			return null;
		}
		else{
			HMNode node = buckets[bi].get(di);
			return node.val;			
		}
	}

	public V remove(K key) throws Exception{
		int bi = hashFn(key);
		int di = getIdxWithinBucket(key , bi);
		if(di == -1){
			return null;
		}
		else{
			HMNode node = buckets[bi].remove(di);
			this.size--;
			return node.val;			
		}
	}

	public int size(){
		return this.size;
	}

	public ArrayList<K> keySet() throws Exception{
		ArrayList<K> l = new ArrayList<>();
		for(int i = 0; i < buckets.length; i++){
			for(HMNode n : buckets[i]){
				l.add(n.key);
			}
		}
		return l;
	}

	public void display(){
		for(int i = 0; i < buckets.length; i++){
			for(HMNode n : buckets[i]){
				System.out.println(n.key + " - " + n.val);
			}
		}
	}


}