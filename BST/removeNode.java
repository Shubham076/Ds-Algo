class removeNode{
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

    	public static int max(Node root){
    		if(root.right != null){
    			return max(root.right);
    		}
    		else{
    			return root.data;
    		}
    	}

    	public static Node remove(Node node , int val){
    		if(node == null){
    			return null;
    		}

    		if(val > node.data){
    			node.right = remove(node.right , val);
    		}
    		else if(val < node.data){
    			node.left = remove(node.left , val);
    		}
    		else{
    			// work found the node
    			if(node.left != null && node.right != null){
    				int lmax = max(node.left);
    				node.data = lmax;

    				// now remove the data from the left subtree
    				node.left = remove(node.left , lmax);
    				return node;
    			}
    			else if(node.left != null){
    				return node.left;
    			}
    			else if(node.right != null){
    				return node.right;
    			}
    			else{
    				// leaf node
    				return null; 
    			}
    		}

    		return node;
    	}

	public static void main(String[] args){
		int[] arr = {12, 25, 37, 50, 60, 62, 72, 87};
		Node root = construct(arr , 0 , arr.length - 1);
		display(root);
		remove(root , 72);
		System.out.println();
		display(root);
	}
}