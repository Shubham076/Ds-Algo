package Heap;

public class heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		heap h=new heap();
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(40);
	h.add(5);
	h.add(3);
		h.display();
		
		System.out.println();
		
		System.out.println(h.size()+"---------");
		
		h.remove();
		h.display();
		
		System.out.println();
		
		h.remove();
		h.display();	
	}
	
	

}
