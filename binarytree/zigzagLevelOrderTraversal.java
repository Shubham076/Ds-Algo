class zigzagLevelOrderTraversal{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        zigzagTraversal(l, root);
        return l;
    }

	 public void zigzagTraversal(List<List<Integer>> list, TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> hs = new Stack<>();
        int l = 0;
        s.add(root);
        List<Integer> ll = new ArrayList<>();
        while(s.size() > 0){	
            TreeNode rp = s.pop();
            ll.add(rp.val);
            
            if(l % 2 == 1){
                if(rp.right != null) hs.add(rp.right);
                if(rp.left != null) hs.add(rp.left);
                   
            }
            else{
                if(rp.left != null) hs.add(rp.left);
                if(rp.right != null) hs.add(rp.right);
            }
            
            if(s.size() == 0){
                s = hs;
                hs = new Stack<>();
                list.add(ll);
                ll = new ArrayList<>();
                l++;
            }
        }
    }
}