package stacksandqueues;

public class stackusingarrayclient {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		stackusingarray stack=new stackusingarray(5);
//		stack.push(10);
//		stack.display();
		
		for(int i=1;i<=5;i++)
		{
			stack.push(i*10);
		}
		//stack.push(30);
		stack.display();
		System.out.println();
		System.out.println(stack.top());
		stack.pop();
		stack.display();
		System.out.println();
		System.out.println(stack.isempty());
		
		
	}

}
