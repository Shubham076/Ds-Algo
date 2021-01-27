import java.util.Scanner;
class intersectionOfList{
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

        public Node getNodeAt(int index){

			if (index < 0 || index >= this.size) {
				return null;
			}

			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
	}

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

    }

     public static void intersection(LinkedList l1 , LinkedList l2){
        	int k = Math.abs(l1.size - l2.size);
        	Node h1 = l1.head;
        	Node h2 = l2.head;

        	if(l1.size > l2.size){
        		for(int i = 0 ; i < k; i++){
        			h1 = h1.next;
        		}
        	}
        	else{
        		for(int i = 0; i < k; i++){
        			h2 = h2.next;
        		}
        	} 
        	while(h1 != h2){
        		h1 = h1.next;
        		h2 = h2.next;
        	}
        	System.out.print(h1.data);
        }
    
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();

		for(int i = 0; i < n1; i++){
			l1.addLast(scn.nextInt());
		}
		int n2 = scn.nextInt();
		for(int i = 0 ; i < n2; i++){
			l2.addLast(scn.nextInt());
		}

		int li = scn.nextInt();
        int di = scn.nextInt();
        if (li == 1) {
            Node n = l1.getNodeAt(di);
            l2.tail.next = n;
            l2.tail = l1.tail;
            l2.size += l1.size - di;
        } else {
            Node n = l2.getNodeAt(di);
            l1.tail.next = n;
            l1.tail = l2.tail;
            l1.size += l2.size - di;
        }

		intersection(l1 , l2);
	}
}