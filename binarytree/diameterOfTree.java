import java.util.*;
public class diameterOfTree {
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

    static class diaPair{
        int dia;
        int height;

        public diaPair(){}
        
        public diaPair(int dia , int height){
            this.dia = dia;
            this.height = height;
        }
    }

    public static diaPair diameter(Node root){
        if(root == null){
            diaPair bp = new diaPair();
            bp.height = -1;
            bp.dia = 0;

            return bp;
        }

        diaPair l = diameter(root.left);
        diaPair r = diameter(root.right);

        int height = Math.max(l.height , r.height) + 1;
        int val = l.height + r.height + 2;
        int dia = Math.max(val , Math.max(l.dia , r.dia));
        diaPair d = new diaPair(dia , height);

        return d;

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
    public static void main(String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        // display(root);
        diaPair d = diameter(root);
        System.out.println(d.dia);
    }

}
