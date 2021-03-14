import java.util.*;
class pathToLeafFromRootInRange{
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

    public static void solution(Node root, int lo ,int hi, String path, int sum){
    	if(root.left == null && root.right == null){
    		sum += root.data;
    		path += root.data;
    		if(sum >= lo && sum <= hi){
    			System.out.println(path);
    		}
    	}
    	else if(root.left == null){
    		solution(root.right, lo, hi, path + root.data + " ", sum + root.data);
    	}
    	else if(root.right == null){
    		solution(root.left, lo, hi, path + root.data + " ", sum + root.data);
    	}
    	else{
    		solution(root.left, lo, hi, path + root.data + " ", sum + root.data);
    		solution(root.right, lo, hi, path + root.data + " ", sum + root.data);
    	}
    }
    public static void main(String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, 40, null, null, 75, 62, 60, null, null,70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        int lo = 150;
        int hi = 250;
        display(root);
        solution(root, lo , hi, "", 0);
    }
}