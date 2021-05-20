public class linkedlist {
	private class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node head;
	Node tail;
	int size;

	public linkedlist() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void addfirst(int data) {
		Node n = new Node(data, this.head);
		this.head = n;

		if (isempty()) {
			this.tail = n;
		}
		this.size++;
	}

	public void addlast(int data) {
		Node n = new Node(data, null);
		
		if (this.isempty()) {
			this.tail = n;
			this.head = n;
		} else
			this.tail.next = n;
			this.tail = n;
		this.size++;
	}

	public Node getnodeat(int index) throws Exception {

		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addat(int index, int data) throws Exception {

		if (index < 0 || index > this.size()) {
			throw new Exception("invalid");
		}

		if (index == 0) {
			this.addfirst(data);
		}

		else if (index == this.size()) {
			this.addlast(data);
		}

		else {
			Node temp = getnodeat(index - 1);
			Node n = new Node(data, temp.next);
			temp.next = n;
			this.size++;
		}
	}

	public int getfirst() throws Exception {
		if (isempty()) {
			throw new Exception("list is Empty");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (isempty()) {
			throw new Exception("list is Empty");
		}
		return this.tail.data;
	}

	public int getat(int index) throws Exception {
		if (this.isempty()) {
			throw new Exception("List is empty");
		}
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}
		return this.getnodeat(index).data;

	}

	public int removeatfirst() throws Exception {
		if (isempty()) {
			throw new Exception("List is empty");
		}
		Node rv = this.head;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else
			this.head = this.head.next;
			this.size--;
		return rv.data;
	}

	public int removeatlast() throws Exception {
		if (isempty()) {
			throw new Exception("List is empty");
		}
		Node rv = this.tail;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		}

		else {
			Node temp = getnodeat(this.size - 2);

			temp.next = null;
			this.tail = temp;
		}
		this.size--;
		return rv.data;

	}

	public int removeat(int index) throws Exception {
		if (isempty()) {
			throw new Exception("List is empty");
		}
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return this.removeatfirst();
		} else if (index == this.size - 1) {
			return this.removeatlast();
		} else {
			Node temp = getnodeat(index - 1);
			Node rv = temp.next;
			temp.next = temp.next.next;

			this.size--;
			return rv.data;
		}
	}
	/// reverse data iterative;
	public void reverseDI() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = this.getnodeat(left);
			Node rn = this.getnodeat(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	/// reverse pointer iterative
	public void reversePI() {
		Node prev = null;
		Node cur = this.head;
		while (cur != null) {
			Node next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;

		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

    public int kthFromLast(int k) {
        // write your code here
        Node slow = this.head;
        Node fast = this.head;
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }
        
        while(fast != tail){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }

	public int midnode() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast != tail && fast.next != tail) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int find(int data) {
		int index = 0;
		Node temp = this.head;
		while (temp != null) {
			if (temp.data == (data)) {
				return index;
			}
			index++;
			temp = temp.next;
		}

		return -1;
	}

	public void displayReverse(){
		this.displayReverse(this.head);
	}

	private void displayReverse(Node head){
		if(head == null){
			return;
		}

		displayReverse(head.next);
		System.out.print(head.data + " ");
	}

	// reverse by pointers (recursive)
	private void reverseByP(Node node){
		if(node == null){
			return;
		}

		reverseByP(node.next);
		if(node == this.tail){

		}
		else{
			node.next.next = node;
		}
	}

	public void reverseByP(){
		this.reverseByP(this.head);
		head.next = null;
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	Node left;

	// reverse by data recursive
	private void dataRecursive(Node right, int level){
		if(right == null){
			return;
		}

		dataRecursive(right.next , level + 1);
		if(level > size / 2){
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			left = left.next;
		}
	}

	public void dataRecursive(){
		left = this.head;
		this.dataRecursive(this.head , 0);
	}
}
