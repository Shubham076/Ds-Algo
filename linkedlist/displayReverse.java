class displayReverse{
	public static void main(String[] args){
		linkedlist l = new linkedlist();
		for(int i = 1; i <= 5; i++){
			l.addlast(i);
		}

		l.display();

		// by recursion
		l.displayReverse();
		System.out.println();

		// reverse a linked list using pointers (recursion)
		l.reverseByP();
		l.display();


		// reverse a linked list by data recursive
		l.dataRecursive();
		l.display();
	}
}