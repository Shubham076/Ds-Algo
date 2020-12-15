import java.util.*;
public class areTreesSimilarInShape {
    static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data){
            this.data = data;
        }
    }

    public static Node constructTree(int[] arr){
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
        return root;
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

    public static boolean areSimilar(Node root1 , Node root2){
        if(root1.children.size() != root2.children.size())
            return false;

        for(int i = 0; i < root1.children.size(); i++){
            Node c1 = root1.children.get(i);
            Node c2 = root2.children.get(i);

            if(!areSimilar(c1, c2)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        int[] arr2 = {1, 2, 5, -1, 6, -1, -1, 3, 7, -1, 8, 11, -1, 12, -1, -1, 9, -1, -1, 4, 10, -1, -1, -1};
        Node root1 = constructTree(arr1);
        Node root2 = constructTree(arr2);

        System.out.println(areSimilar(root1, root2));

   
    
    }
}
