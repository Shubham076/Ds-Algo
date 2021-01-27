import java.util.Scanner;
class foldOfList{
	static class Node {
        char data;
        Node next;
    }

     static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(char c) {
            Node temp = new Node();
            temp.data = c;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
        Node left;
        public void fold(){
        	left = this.head;
        	this.fold(this.head , 0);
        }

        private void fold(Node right , int l){
        	if(right == null){
        		return;
        	}
        	fold(right.next , l + 1);

        	if(l > this.size / 2){
        		Node temp = left.next;
        		left.next = right;
        		right.next = temp;
        		left = temp;
        	} else if(l == this.size / 2) {
        		this.tail = right;
        		tail.next = null;
        	}
        }
    }

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LinkedList l = new LinkedList();
		for(int i = 0; i < n; i++){
			char c = scn.next().charAt(0);
			l.addLast(c);
		}

		l.display();
		l.fold();
		l.display();
	}
}