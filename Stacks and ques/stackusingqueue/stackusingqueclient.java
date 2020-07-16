package stacksandqueues;

public class stackusingqueclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		stackusingque stack=new stackusingque();
		
		for(int i=1;i<=5;i++)
		{
			stack.push(i*10);
		}
		stack.display();
		
		stack.pop();
		stack.display();
		
		System.out.println(stack.size());
	}

}
