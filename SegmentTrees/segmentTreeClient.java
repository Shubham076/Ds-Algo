package SegmentTrees;

public class segmentTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,8,7,6,-2,-8,4,9};
		
		segmentTree tree=new segmentTree(arr);
		
		tree.display();

		System.out.println("----------");
		
		System.out.println(tree.query(2, 6));
		System.out.println("-------------------");
		
		tree.update(3, 14);
		tree.display();

}
	
}
