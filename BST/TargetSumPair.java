import java.util.ArrayList;

class TargetSumPair{
	static class Node{
	 	int data;
	 	Node left;
	 	Node right;
	 	public Node(int data , Node left , Node right){
	 		this.data = data;
	 		this.left = left;
	 		this.right = right;
	 	}
	}

	 	public static Node construct(int[] arr , int lo , int hi){
	 		if(lo > hi){
	 			return null;
	 		}

	 		int mid = (lo + hi) / 2;
	 		int data = arr[mid];
	 		Node lc = construct(arr , lo , mid - 1);
	 		Node rc = construct(arr , mid + 1 , hi);
	 		Node n = new Node(data , lc, rc);
	 		return n;

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

    	public static boolean find(Node root , int val){
    		if(root == null){
    			return false;
    		}

    		if(val > root.data){
    			return find(root.right , val);
    		}
    		else if(val < root.data){
    			return find(root.left , val);
    		}
    		else{
    			return true;
    		}
    	}

    	// O(nh) n nodes h height of tree
    	public static void targetPair(Node root, Node node, int target){
    		if(node == null){
    			return;
    		}

    		targetPair(root , node.left , target);
    		int n = target - node.data;
    		if(n > node.data){
    			if(find(root , n)){
    				System.out.println(node.data + " - " + n);
    			}
    		}
    		targetPair(root , node.right , target);
    	}

    	// O(N)
    	public static void targetPair2(Node root, int target){
    		ArrayList<Integer> l = new ArrayList<>();
    		inOrder(root, l);
    		int left = 0;
    		int right = l.size() - 1;
    		while(left < right){
    			int val1 = l.get(left);
    			int val2 = l.get(right);
    			int data = val1 + val2;

    			if(data > target){
    				right--;
    			}
    			else if(data < target){
    				left++;
    			}
    			else{
    				System.out.println(val1 + " " + val2);
    				left++;
    				right--;
    			}
    		}
    	}

    	public static void inOrder(Node root, ArrayList<Integer> l){
    		if(root == null){
    			return;
    		}

    		inOrder(root.left, l);
    		l.add(root.data);
    		inOrder(root.right, l);
    	}

	public static void main(String[] args){
		int[] arr = {12, 25, 30, 50, 70, 75, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);
		System.out.println("\nTarget pairs are:");
		targetPair(root , root , 100);
	}
}