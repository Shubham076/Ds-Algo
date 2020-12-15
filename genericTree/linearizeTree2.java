import java.util.*;
public class linearizeTree2 {
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

    // time complexity O(N)
    public static Node linearize_Tree(Node root){
        
        if(root.children.size() == 0){
            return root;
        }

        Node lct = linearize_Tree(root.children.get(root.children.size() - 1)); //last child tail
        while(root.children.size() > 1){
            Node lc = root.children.remove(root.children.size() - 1);  // last child
            Node slc = root.children.get(root.children.size() - 1);    // second last child
            Node slct = linearize_Tree(slc);  //second last child tail
            slct.children.add(lc);
        }

        return lct;
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
