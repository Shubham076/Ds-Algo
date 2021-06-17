/*leetcode 958
 In a complete binary tree, every level, except possibly the
 last, is completely filled, and all nodes in the last level are as far left
 as possible
*/
 import java.util.*; 
class isBinaryTreeCompleteBinaryTree{
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
}