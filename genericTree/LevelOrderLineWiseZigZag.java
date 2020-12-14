import java.util.*;

public class LevelOrderLineWiseZigZag {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        
    }

    static void LevelOrder(Node root){
     Stack<Node> s = new Stack<>();
     Stack<Node> cs = new Stack<>();   //childStack

     s.push(root);
     
     while(s.size() > 0){
    Node n = s.pop();
    System.out.print(n.data+" ");
    for(Node child : n.children){
         cs.push(child);
     }

     if(s.size() == 0){
         s = cs;
         cs = new Stack<>();
         System.out.println();
     }
      
    }
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

    LevelOrder(root);

    }
}
}
