class removeduplicatesFromList{
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
     }

	public static void main(String[] args){
		LinkedList l = new LinkedList();
		int j = 2;
		for(int i = 1; i <= 3; i++){
			for(int k = 1; k <= 2; k++){
				l.addLast(j);
			}
			j++;
		}

		l.display();
		removeDuplicates(l);
		l.display();

	}

	public static void removeDuplicates(LinkedList l){
		Node temp = l.head;
		while(temp != null && temp.next != null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}
			else
				temp = temp.next;
		}

	}	
}