package BST;

public class bstckient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70,80};
		
		
		bst tree=new bst(arr);
		
		tree.display();
		System.out.println(tree.find(100));
		
		System.out.println(tree.max());
		
		System.out.println(tree.min());
		
		System.out.println();
		tree.add(90);
		tree.display();
		
		System.out.println();
		tree.remove(90);
		tree.display();
	}

}
