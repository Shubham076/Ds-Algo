package linkedlist;

public class stackusingllclient{

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			
		stackusingll stack=new stackusingll();
		
		for(int i=1;i<5;i++)
		{
			stack.push(i*10);
		}
		stack.display();
		
		System.out.println(stack.size());
		System.out.println(stack.top());
		
		stack.pop();
		stack.display();
	}

}
