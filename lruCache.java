import java.util.*;
//least recently used cache
class lruCache{
	static class node{
		char key;
		int val;
		node prev;
		node next;

		public node(char key, int value){
			this.key = key;
			this.val = value;
		}

		@Override
		public String toString(){
			return this.val + "";
		}
	}
	private int capacity;
	private node head, tail;
	HashMap<Character, node> cache;

	public lruCache(int capacity){
		cache = new HashMap<>();
		this.capacity = capacity;
		this.head = null;
		this.tail = null;
	}

	public int get(char key){
		if(cache.containsKey(key)){
			node n = cache.get(key);
			delete(n);
			setHead(n);
			return n.val;
		}
		else{
			return -1;
		}
	}

	public char getMostRecentKey(){
		return head.key;
	}

	//delete
	private void delete(node n){
		if(n.prev != null){
			n.prev.next = n.next;
		}
		else{
			this.head = n.next;
		}

		if(n.next != null){
			n.next.prev = n.prev;
		}
		else{
			tail = n.prev;
		}
	}

	private void setHead(node n){
		n.next = head;
		n.prev = null;

		if(head != null){
			head.prev = n;
		}

		head = n;
		if(tail == null){
			tail = head;
		}
	}

	public void add(char c, int v){
		if(cache.containsKey(c)){
			node old = cache.get(c);
			old.val = v;
			delete(old);
			setHead(old);
		}
		else{
			node n = new node(c, v);
			if(cache.size() >= capacity){
				cache.remove(tail.key);
				delete(tail);
				setHead(n);
			}
			else{
				setHead(n);
			}

			cache.put(c, n);
		}
	}

	public void display(){
		System.out.println(cache);
	}
	public static void main(String[] args){
		lruCache l = new lruCache(3);
		l.add('a', 1);
		l.add('b', 2);
		l.add('c', 3);

		System.out.println(l.getMostRecentKey());
		l.display();
		System.out.println(l.get('a'));
		System.out.println(l.getMostRecentKey());

		l.add('d', 4);
		System.out.println(l.getMostRecentKey());
		l.display();

	}
}