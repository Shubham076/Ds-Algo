import java.util.*;

public class RemoveLeafNodesGenericTree {
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

        static void removeLeaves(Node root){
            
            for(int i = root.children.size() - 1;  i >= 0; i--){
                Node n = root.children.get(i);
                if(n.children.size() == 0)
                    root.children.remove(n);
            }
            
            for(Node child : root.children){
                removeLeaves(child);
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
    
            display(root);
            removeLeaves(root);
            System.out.println("---------");
            display(root);
        
        }
}

