import java.util.*;
public class PrintKLevelsDown {
    static class Node{
        int data;
         Node left = null;
         Node right = null;

         public Node(int data , Node left , Node right){
             this.data = data;
             this.left = left;
             this.right = right;
         }
    }

         static class Pair{
             Node n;
             int state;
             public Pair(Node n , int state){
                 this.n = n;
                 this.state = state;
             }
         }
    

    private static Node constructBinaryTree(Integer[] arr) {
        Stack<Pair> s = new Stack<>();
        Node root = new Node(arr[0] , null , null);
        s.push(new Pair(root , 1));
        int idx = 0;

        while(s.size() > 0){
            Pair p  = s.peek();

            if(p.state == 1){
                idx++;
                if(arr[idx] != null){
                    Node left = new Node(arr[idx] , null , null);
                    p.n.left = left;
                    s.push(new Pair(left , 1));
                }
                p.state++;

            }
            else if(p.state == 2){
                idx++;
                if(arr[idx] != null){
                    Node right = new Node(arr[idx] , null , null);
                    p.n.right = right;
                    s.push(new Pair(right , 1));
                }
                p.state++;
            }
            else{
                s.pop();
            }
        }

        return root;
    }

    public static void display(Node root){

        if(root == null)
            return;
        String str = "";
        str += root.left != null ? root.left.data + " " : ". ";
        str += "<-- " + root.data + " -->";
        str += root.right != null ? " " + root.right.data :  " .";
        System.out.println(str);
        display(root.left);
        display(root.right);
    }

    public static void printKLevels(Node root , int  k){
        if(root == null || k < 0)
            return;

        if(k == 0)
            System.out.println(root.data);
        
        printKLevels(root.left , k  - 1);
        printKLevels(root.right , k  - 1);
    }
    public static void main(String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        display(root);
        printKLevels(root , 2);
    }

}
