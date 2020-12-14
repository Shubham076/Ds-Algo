import java.util.*;
public class LevelOrderLineWiseMoreApproaches {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        
    }

    static void LevelOrder(Node root){
     ArrayDeque<Node> q = new ArrayDeque<>();

     q.addLast(root);
     q.add(new Node(-1));

     
     while(q.size() > 0){
    Node n = q.removeFirst();

    if(n.data != -1){
        System.out.print(n.data+" ");
        for(Node child : n.children){
                q.add(child);
            }
    } 
    else {
        if(q.size() > 0){
            q.add(new Node(-1));
            System.out.println();
        }
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
