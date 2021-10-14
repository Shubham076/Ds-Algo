import java.util.*;
class zigzagLevelOrderTraversal{
    static class Node {
		int val;
		Node left;
		Node right;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        zigzagTraversal(l, root);
        return l;
    }

	 public static void zigzagTraversal(List<List<Integer>> list, Node root){
        Stack<Node> s = new Stack<>();
        Stack<Node> hs = new Stack<>();
        int l = 0;
        s.add(root);
        List<Integer> ll = new ArrayList<>();
        while(s.size() > 0){	
            Node rp = s.pop();
            ll.add(rp.val);
            
            if(l % 2 == 1){
                if(rp.right != null) hs.add(rp.right);
                if(rp.left != null) hs.add(rp.left);
                   
            }
            else{
                if(rp.left != null) hs.add(rp.left);
                if(rp.right != null) hs.add(rp.right);
            }
            
            if(s.size() == 0){
                s = hs;
                hs = new Stack<>();
                list.add(ll);
                ll = new ArrayList<>();
                l++;
            }
        }

        System.out.println(list);
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

    public static void main(String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = constructBinaryTree(arr);
        // display(root);
        List<List<Integer>> list = new ArrayList<>();
        zigzagTraversal(list, root);
    }
}