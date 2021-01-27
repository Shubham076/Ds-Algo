import java.util.Scanner;
class isListPalindrome{
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

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        Node left;
        private boolean isPalindrome(Node right){
        	if(right == null){
        		return true;
        	}

        	boolean res = isPalindrome(right.next);
        		if(!res){
        			return false;
        		}
        		else if(left.data != right.data){
        			return false;
        		}
        		else{
        			left = left.next;
        			return true;
        		}
        	
        }

        public boolean isPalindrome(){
        	left = this.head;
        	return this.isPalindrome(this.head);
        }
    }

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		LinkedList l = new LinkedList();
		for(int i = 1; i <=5; i++){
			l.addLast(scn.nextInt());
		}

		System.out.println(l.isPalindrome());
	}
}