import java.util.*;

public class linearizeTree {
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

    // time complexity O(N2)
    public static void linearize_Tree(Node root){
        for(Node child : root.children){
            linearize_Tree(child);
        }

        while(root.children.size() > 1){
            Node lc = root.children.remove(root.children.size() - 1);   //last child
            Node lsc = root.children.get(root.children.size() - 1);  //last second child
            Node lst = getTail(lsc);
            lst.children.add(lc);
        }
    }

    private static Node getTail(Node node) {

        while(node.children.size() == 1){
            node = node.children.get(0);
        }
        return node;
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
        linearize_Tree(root);
        System.out.println("---------");
        display(root);
    
    }
}
