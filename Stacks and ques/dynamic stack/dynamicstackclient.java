package stacksandqueues;

public class dynamicstackclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		stackusingarray p=new dynamicstack(5);
		for(int i=0;i<=10;i++)
		{
			p.push(i*10);
		}
		p.display();
		System.out.println();

	}

}
