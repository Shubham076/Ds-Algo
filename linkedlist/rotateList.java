import java.util.Scanner;
class rotateList{
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

        public void reverseDI(int left , int right){
        while (left < right) {
            Node ln = this.getNodeAt(left);
            Node rn = this.getNodeAt(right);
            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;
            left++;
            right--;
        }
    }

    public Node getNodeAt(int index) {

        if (index < 0 || index >= this.size()) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void rotate(int k){
            k = k % this.size;

            if(k < 0){
                k = k + this.size;
            }

            this.reverseDI(0 , this.size - k - 1);
            this.reverseDI(this.size - k , this.size - 1);
            this.reverseDI(0 , this.size - 1);

        }
    }

    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int k = scn.nextInt();
    	LinkedList l = new LinkedList();
    	for(int i = 1; i <= 5; i++){
    		l.addLast(i);
    	}

    	l.display();
        l.rotate(k);
        l.display();
    }
}