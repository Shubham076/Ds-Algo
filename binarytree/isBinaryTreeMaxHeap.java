//https://practice.geeksforgeeks.org/problems/is-binary-tree-heap/1
class isBinaryTreeMaxHeap {
	static class Node {
		int data;
		Node left, right;
		Node(int d) {
			data = d;
			left = right = null;
		}
	}
	public static int cnt(Node root){
		if(root == null){
			return 0;
		}
		int lc = cnt(root.left);
		int rc = cnt(root.right);
		return lc + rc + 1;
	}

	public boolean verifyTree(Node root, int idx, int n){
		if(root == null) return true;

		if(idx > n){
			return false;
		}
		return verifyTree(root.left, 2 * idx, n) && verifyTree(root.right, 2 * idx + 1, n);
	}

	public boolean checkHeap(Node root){
		if(root == null) return true;
		if(root.left == null && root.right == null) return true;
		if(root.right == null){  //means second last level
			return root.data >= root.left.data;
		}
		//checking the property with both child
		if(root.data >= root.left.data && root.data >= root.right.data){
			return checkHeap(root.left) && checkHeap(root.right);
		}
		return false;
	}
	static int n;
	boolean isHeap(Node root){
		n = cnt(root);
		//first checking whether the given tree is complete binary tree or not
		boolean isComplete = verifyTree(root, 1, n);
		if(!isComplete){
			//if tree is not complete binary tree
			return false;
		}
		else{
			//now checking whether tree follows property of max heap or not
			return checkHeap(root);
		}
	}
}