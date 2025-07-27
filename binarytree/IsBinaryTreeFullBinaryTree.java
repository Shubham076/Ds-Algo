/*
full binary tree is the tree in which all the nodes have 2 children except the leaf nodes
https://practice.geeksforgeeks.org/problems/full-binary-tree/1
*/
class IsBinaryTreeFullBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	//O(N)
	public boolean isFullTree(TreeNode root) {
     	if(root == null) return true;

     	//leaf nodes
     	else if(root.left == null && root.right == null){
     		return true;
     	}   

     	else if(root.left != null && root.right != null){
     		return isFullTree(root.left) && isFullTree(root.right);
     	}
     	else return false;
    }
}