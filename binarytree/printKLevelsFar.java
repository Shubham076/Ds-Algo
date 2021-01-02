import java.util.*;
public class printKLevelsFar {
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
    public static ArrayList<Node> node2Root(Node root , int data){
        if(root == null)
            return new ArrayList<>();
        
        if(root.data == data){
            ArrayList<Node> ans = new ArrayList<>();
            ans.add(root);
            return ans;
        }

        ArrayList<Node> l = node2Root(root.left, data);
        if(l.size() > 0){
            l.add(root);
            return l;
        }

        ArrayList<Node> r = node2Root(root.right, data);
        if(r.size() > 0){
            r.add(root);
            return r;
        }

        return new ArrayList<>();
    }

    public static void printKLevelsDown(Node root , int  k , Node block){
        if(root == null || k < 0 || root == block)
            return;

        if(k == 0)
            System.out.println(root.data);
        
            printKLevelsDown(root.left , k  - 1 , block);
            printKLevelsDown(root.right , k  - 1 , block);

    }
    public static void printKLevelsfar(Node root , int k , int data){
        ArrayList<Node> path = node2Root(root, data);
        for(int i = 0; i < path.size(); i++){
            printKLevelsDown(path.get(i), k - i , i == 0 ? null : path.get(i - 1));
        }
    }
    public static void main(String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        // display(root);
        printKLevelsfar(root , 2 , 37);
    }

}
