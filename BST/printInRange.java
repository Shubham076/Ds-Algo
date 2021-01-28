class printInRange{
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
    	//pir print in range
    	public static void pir(Node root , int d1 , int d2){
    		if(root == null){
    			return;
    		}

    		if(d1 < root.data && d2 < root.data){
    			pir(root.left , d1 , d2);
    		}
    		else if(d1 > root.data && d2 > root.data){
    			pir(root.right , d1 , d2);
    		}
    		else{
    			pir(root.left, d1 , d2);
    			System.out.print(root.data + " ");
    			pir(root.right , d1 , d2);
    		}
    	}

	public static void main(String[] args){
		int[] arr = {12, 25, 37, 50, 60, 72, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);

		System.out.println();
		pir(root , 27 , 72);
	}
}