//a binary tree is symmetric if  both left and right subtree are mirror images of each other
class isTreeSymmetric{
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
	public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public static boolean isMirror(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == q;
        }
        
        return p.val == q.val  && isMirror( p.left , q.right) && isMirror( p.right , q.left);
    }
}