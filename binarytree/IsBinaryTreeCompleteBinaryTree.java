/*leetcode 958
 In a complete binary tree, every level, except possibly the
 last, is completely filled, and all nodes in the last level are as far left
 as possible
*/
 import java.util.*; 
class IsBinaryTreeCompleteBinaryTree {
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
	/*O(N)
	Perform a level order traversal
	 check if we get a non-null node after a null node. If so, tree is not complete, else it is complete.
	 because For a complete binary tree, there should not be any node after we met an empty one.

	 one important note only linkedlist implementation allow null values not arraydeque
	*/
	public boolean isCompleteTree(TreeNode root) {
		if(root == null) return true;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean foundEmpty = false;
		while(q.size() > 0){
			TreeNode cur = q.remove();
			if(cur == null) foundEmpty = true;
			else{
				if(foundEmpty) return false;
				q.add(cur.left);
				q.add(cur.right);
			}
		}
		return true;
	}

	//using recursion
	public static int cnt(TreeNode root){
		if(root == null){
			return 0;
		}
		int lc = cnt(root.left);
		int rc = cnt(root.right);
		return lc + rc + 1;
	}

	public boolean verifyTree(TreeNode root, int idx, int n){
		if(root == null) return true;

		if(idx > n){
			return false;
		}
		return verifyTree(root.left, 2 * idx, n) && verifyTree(root.right, 2 * idx + 1, n);
	}
	static int n;
	//O(2  * N) space if stack space is not considered O(1) otherwise O(h) h is the height of recursion tree
	public boolean isCompleteTree2(TreeNode root){
		n = cnt(root);
		return verifyTree(root, 1, n);
	}
}