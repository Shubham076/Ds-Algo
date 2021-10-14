//leet code 979
/**
 * Definition for a binary tree node.
 * 
 */

// positive indicates excess coins, -ve means need coins 0 means neither needed
// nor supplied coins
class distributecoinsInTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	int ans = 0;

	public int distributecoins(TreeNode root) {
		solve(root);
		return ans;
	}

	public int solve(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftInfo = solve(root.left);
		int rightInfo = solve(root.right);
		ans += Math.abs(leftInfo) + Math.abs(rightInfo);
		return leftInfo + rightInfo + root.val - 1;
	}
}