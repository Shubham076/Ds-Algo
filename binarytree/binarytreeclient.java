package binarytree;

public class binarytreeclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false false 60 falsefalse
		binarytree tree=new binarytree();
		
		tree.display();
		
		tree.preordertraversal();
		System.out.println();
		
		tree.postordertraversal();
		System.out.println();
		
		tree.inordertraversal();
		System.out.println();
		
		tree.levelorder();

	}

}
