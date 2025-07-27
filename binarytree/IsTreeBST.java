import java.util.*;
public class IsTreeBST {
    static class Node {
        int data;
        Node left = null;
        Node right = null;

        public Node(int data , Node left , Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair {
        Node n;
        int state;
        public Pair(Node n , int state) {
            this.n = n;
            this.state = state;
        }
    }


    private static Node constructBinaryTree(Integer[] arr) {
        Stack<Pair> s = new Stack<>();
        Node root = new Node(arr[0] , null , null);
        s.push(new Pair(root , 1));
        int idx = 0;

        while (s.size() > 0) {
            Pair p  = s.peek();

            if (p.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    Node left = new Node(arr[idx] , null , null);
                    p.n.left = left;
                    s.push(new Pair(left , 1));
                }
                p.state++;

            } else if (p.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    Node right = new Node(arr[idx] , null , null);
                    p.n.right = right;
                    s.push(new Pair(right , 1));
                }
                p.state++;
            } else {
                s.pop();
            }
        }

        return root;
    }

    public static void display(Node root) {

        if (root == null)
            return;
        String str = "";
        str += root.left != null ? root.left.data + " " : ". ";
        str += "<-- " + root.data + " -->";
        str += root.right != null ? " " + root.right.data :  " .";
        System.out.println(str);


        display(root.left);
        display(root.right);

    }
    static class bstPair {
        boolean isBST;
        int max;
        int min;
    }

    public static bstPair isBSt(Node root) {
        if (root == null) {

            // base pair
            bstPair bp = new bstPair();
            bp.isBST = true;
            bp.max = Integer.MIN_VALUE;
            bp.min = Integer.MAX_VALUE;
            return bp;
        }

        bstPair l = isBSt(root.left);
        bstPair r = isBSt(root.right);
        bstPair mp = new bstPair();
        mp.isBST = l.isBST && r.isBST && root.data > l.max && root.data < r.min;

        mp.min = Math.min(root.data , Math.min(l.min , r.min));
        mp.max = Math.max(root.data , Math.max(l.max , r.max));
        return mp;
    }

    //second method
    public static boolean isBst2(Node root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data < min) {
            return false;
        }

        if (max != null && root.data > max) {
            return false;
        }

        return isBst2(root.left, min, root.data) && isBst2(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        // display(root);
        bstPair p  = isBSt(root);
        System.out.println(p.isBST);
    }
}
