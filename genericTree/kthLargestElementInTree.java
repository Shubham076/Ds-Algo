import java.util.*;
public class kthLargestElementInTree {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    static void display(Node root){
        String s = root.data+" =>";

        for(Node child : root.children){
            s +=  " " + child.data+" ";
        }

        System.out.println(s);

        for(Node child : root.children){
            display(child);
        }
    }

    public static void kthLargest(Node root , int k){
        pq.add(root.data);
        if(pq.size() > k){
            pq.remove();
        }

     
        for(Node child : root.children){
            kthLargest(child , k);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, -50, -1, 60, -1, -1, 30, 70, -1, -80, 110, -1, -120, -1, -1, 90, -1, -1, 40, -100, -1, -1, -1};
        Node root = null;
        Stack<Node> s = new Stack<>();


        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == -1){
                s.pop();
            }
            else{
                Node n = new Node(arr[i]);
                if(s.size() > 0){
                    s.peek().children.add(n);
                }
                else{
                    root = n;
                }

                s.push(n);
            }
        }

        // display(root);
        int  k = 8;
        
        kthLargest(root , k);
        System.out.println(k+"th largest number is: "+pq.remove());

    

    
    }
}
