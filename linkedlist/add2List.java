import java.util.Scanner;
class add2List{
	static class Node {
        int data;
        Node next;
    }

     static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        private int add(Node one , int i , Node two , int j , LinkedList ans){
        	if(one == null && two == null){
        		return 0;
        	}

        	int sum = 0;
        	if(i > j){
        		int oc = add(one.next , i - 1 , two , j , ans);
        		sum += one.data + oc;
        	}
        	else if(j > i){
        		int oc = add(one , i , two.next , j - 1 , ans);
        		sum += two.data + oc;
        	} 
        	else{
        		int oc = add(one.next , i - 1 , two.next , j - 1 , ans);
        		sum += one.data + two.data + oc;
        	}

        	int nc = sum / 10;
        	int n = sum % 10;
        	ans.addFirst(n);
        	return nc;
        }

        public void add(LinkedList l2){
        	LinkedList ans = new LinkedList();
        	int c = this.add(this.head , this.size , l2.head , l2.size , ans);
        	if(c != 0){
        		ans.addFirst(c);
        	}

        	ans.display();
        }
    }
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LinkedList l1 = new LinkedList();
		for(int i = 0; i < n; i++){
			l1.addLast(scn.nextInt());
		}

		int m = scn.nextInt();
		LinkedList l2 = new LinkedList();
		for(int i = 0; i < m; i++){
			l2.addLast(scn.nextInt());
		}
		l1.add(l2);
	}
}