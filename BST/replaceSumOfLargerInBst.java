class replaceSumOfLargerInBst{
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

    	static int sum = 0;
    	public static void replaceLarger(Node root){
    		if(root == null){
    			return;
    		}

    		replaceLarger(root.right);
    		int od = root.data;
    		root.data = sum;
    		sum += od;
    		replaceLarger(root.left);
    	}

	public static void main(String[] args){
		int[] arr = {12, 25, 37, 50, 62, 75, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);

		System.out.println();
		replaceLarger(root);
		display(root);
	}
}