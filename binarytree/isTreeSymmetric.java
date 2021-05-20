class isTreeSymmetric{
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