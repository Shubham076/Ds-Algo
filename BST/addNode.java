class addNode{
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

    	public static Node add(Node root , int val){
    		if(root == null){
    			Node n = new Node(val , null, null);
    			return n;
    		}

    		if(val > root.data){
    			root.right = add(root.right , val);
    		}
    		else if(val < root.data){
    			root.left = add(root.left , val);
    		}
    		else{
    			// nothing to do
    		}

    		return root;
    	}

	public static void main(String[] args){
		int[] arr = {12, 25, 37, 50, 62, 72, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);
		System.out.println();
		add(root, 60);
		display(root);
	}
}