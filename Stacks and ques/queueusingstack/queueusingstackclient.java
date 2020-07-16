package stacksandqueues;

public class queueusingstackclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			queueusingstack queue=new queueusingstack();
			
			for(int i=1;i<=5;i++)
			{
				queue.enque(i*10);
			}
			queue.display();
			
			System.out.println();
			
			queue.deque();
			queue.display();
	}

}
