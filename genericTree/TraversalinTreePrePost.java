import java.util.*;

public class TraversalinTreePrePost {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    static void preOrder(Node root){
        System.out.println("Pre "+root.data);
 
        for(Node child : root.children){
            preOrder(child);
        }
     }
 
     static void postOrder(Node root){
         
         for(Node child : root.children){
             postOrder(child);
         }
         System.out.println("Post "+root.data);
      }
    public static void main(String[] args) {

        int[] arr = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
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
        preOrder(root);
        System.out.println();
        postOrder(root);

    }
}
