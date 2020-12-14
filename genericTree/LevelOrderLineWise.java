import java.util.*;

public class LevelOrderLineWise {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        
    }

    static void LevelOrder(Node root){
     ArrayDeque<Node> q = new ArrayDeque<>();
     ArrayDeque<Node> cq = new ArrayDeque<>();  // childqueue

     q.addLast(root);
     
     while(q.size() > 0){
    Node n = q.removeFirst();
    System.out.print(n.data+" ");
    for(Node child : n.children){
         cq.add(child);
     }

     if(q.size() == 0){
         q = cq;
         cq = new ArrayDeque<>();
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