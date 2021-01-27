import java.util.Scanner;
class oddEvenList{
	static class Node {
        int data;
        Node next;
    }

     static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
     

     public int removeFirst(){
		if (this.size == 0) {
			return -1;
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

     public void oddEven(){
     	LinkedList even = new LinkedList();
     	LinkedList odd  = new LinkedList();

     	Node temp = this.head;
     	while(temp != null){
     		int n = this.removeFirst();
     		if(n % 2 == 0){
     			even.addLast(n);
     		} else {
     			odd.addLast(n);
     		}

     		temp = temp.next;
     	}

     	if(even.size > 0 && odd.size > 0){
     		odd.tail.next = even.head;
     		this.head = odd.head;
     		this.tail = even.tail;
     		this.size = odd.size + even.size;
     	}
     	else if(odd.size > 0){
     		this.head = odd.head;
     		this.tail = odd.tail;
     		this.size = odd.size;
     	}
     	else{
     		this.head = even.head;
     		this.tail = even.tail;
     		this.size = even.size;
     	}

     }

    }

     public static void main(String[] args){
     	LinkedList main = new LinkedList();
     	Scanner scn = new Scanner(System.in);
     	int n = scn.nextInt();
     	for(int i = 1; i <= n; i++){
     		int j = scn.nextInt();
     		main.addLast(j);
     	}

     	main.oddEven();
     	main.display();

     	
     }
}