package stacksandqueues;

public class dynamicqueueclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		queueusingarrays p=new dynamicqueue(5);
		for(int i=0;i<10;i++)
		{
			p.enque(i*10);
		}
		p.display();
	}

}
