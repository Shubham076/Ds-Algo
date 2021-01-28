class multiSolver{
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

    	public static int size(Node root){
    		if(root == null){
    			return 0;
    		}

    		int ls = size(root.left);
    		int rs = size(root.right);
    		return ls + rs + 1;
    	}

    	public static int height(Node root){
    		if(root == null){
    			return -1;
    		}

    		int lh = height(root.left);
    		int rh = height(root.right);
    		return Math.max(lh, rh) + 1;
    	}

    	public static int max(Node root){
    		if(root.right != null){
    			return max(root.right);
    		}
    		else{
    			return root.data;
    		}
    	}

    	public static int min(Node root){
    		if(root.left != null){
    			return min(root.left);
    		}
    		else{
    			return root.data;
    		}
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

	public static void main(String[] args){
		int[] arr = {12, 25, 37, 50, 60, 72, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);
		System.out.println();
		System.out.println("Total Nodes : " + size(root));
		System.out.println("Height : " + height(root));
		System.out.println("Max : " + max(root));
		System.out.println("Min : " + min(root));
		System.out.println("is 127 present ? : " + find(root , 127));

	}
}