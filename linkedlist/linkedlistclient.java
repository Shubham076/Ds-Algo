package linkedlist;

public class linkedlistclient   {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		linkedlist list=new linkedlist();
		
		list.addfirst(40);
		list.addfirst(30);
		list.addfirst(10);
		list.display();
		
		list.reverseDI();
		list.display();
		
		System.out.println(list.midnode());
		
		System.out.println(list.size());
		
		list.addlast(50);
		list.display();
		
		list.addat(1,20);
		list.display();
		
		System.out.println(list.getlast());
		
		System.out.println(list.getfirst());
		
		System.out.println(list.getat(3));
		
		list.removeatfirst();
		list.display();
		
		list.removeatlast();
		list.display();
		
		list.removeat(2);
		list.display();
		
		
		list.reversepi();
		
		System.out.println(list.getfirst());
	}

}
