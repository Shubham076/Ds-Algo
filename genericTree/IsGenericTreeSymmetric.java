import java.util.*;
class IsGenericTreeSymmetric {
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

    public static boolean areMirror(Node root1 , Node root2){
        if(root1.children.size() != root2.children.size())
        return false;

    for(int i = 0; i < root1.children.size(); i++){
        int j = root1.children.size() - 1 - i;
        Node c1 = root1.children.get(i);
        Node c2 = root2.children.get(j);

        if(!areMirror(c1, c2)){
            return false;
        }

    }
        return true;
    }

    public static boolean isSymmetric(Node root){
        return areMirror(root, root);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, -1, 90, -1, -1, 40, 100, -1, 110, -1, -1, -1};
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

        System.out.println(isSymmetric(root));
    
    }
}
