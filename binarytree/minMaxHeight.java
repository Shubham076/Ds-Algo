import java.util.*;

public class minMaxHeight {
    static class Node {
        int data;
        Node left = null;
        Node right = null;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair {
        Node n;
        int state;

        public Pair(Node n, int state) {
            this.n = n;
            this.state = state;
        }
    }

    private static Node constructBinaryTree(Integer[] arr) {
        Stack<Pair> s = new Stack<>();
        Node root = new Node(arr[0], null, null);
        s.push(new Pair(root, 1));
        int idx = 0;

        while (s.size() > 0) {
            Pair p = s.peek();

            if (p.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    Node left = new Node(arr[idx], null, null);
                    p.n.left = left;
                    s.push(new Pair(left, 1));
                }
                p.state++;

            } else if (p.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    Node right = new Node(arr[idx], null, null);
                    p.n.right = right;
                    s.push(new Pair(right, 1));
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
        str += root.right != null ? " " + root.right.data : " .";
        System.out.println(str);

        display(root.left);
        display(root.right);

    }

    public static int size(Node root) {

        if (root == null) {
            return 0;
        }
        int ls = size(root.left); // left size
        int rs = size(root.right);

        return ls + rs + 1;

    }

    public static int height(Node root) {

        if (root == null) {
            return -1;
        }
        int lh = height(root.left); // left height
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;

    }

    public static int max(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int lm = max(root.left); // left max
        int rm = max(root.right);

        return Math.max(root.data, Math.max(lm, rm));

    }

    public static int sum(Node root) {

        if (root == null) {
            return 0;
        }
        int ls = sum(root.left); // left sum
        int rs = sum(root.right);

        return ls + rs + root.data;

    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = constructBinaryTree(arr);
        display(root);
        System.out.println();
        System.out.println("Height is :" + height(root) 
                            + "\nSum of all nodes : "
                             + sum(root) + "\nMax is :" + max(root)
                             + "\nSize :" + size(root));

    }

}
