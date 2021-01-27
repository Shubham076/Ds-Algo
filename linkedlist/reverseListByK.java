import java.util.Scanner;
class reverseListByK{
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
    

    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        head = temp;

        if (size == 0) {
            tail = temp;
        }

        size++;
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

    public void reverseByK(int k){
        LinkedList prev = null;

        while(this.size > 0){
            LinkedList cur = new LinkedList();
            if(this.size >= k){
                for(int i = 0; i < k; i++){
                    cur.addFirst(this.removeFirst());
                }
            }
            else{
                //f size is not enough then we dont reverse
                int os = this.size;
                for(int i = 0 ; i < os; i++){
                    cur.addLast(this.removeFirst());
                }
            }

            if(prev == null){
                prev = cur;
            }
            else{
                prev.tail.next = cur.head;
                prev.tail = cur.tail;
                prev.size += cur.size;
            }

        }
        this.head = prev.head;
        this.tail = prev.tail;
    }
}

    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	int k = scn.nextInt();
    	LinkedList l = new LinkedList();
    	for(int i = 1; i <= 10; i++){
    		l.addLast(i);
    	}

    	l.display();
        l.reverseByK(k);
        l.display();
    }
}