package stacksandqueues;

public class queueusingarrayclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		queueusingarrays queue=new queueusingarrays(5);
		for(int i=1;i<=5;i++)
		{
			queue.enque(i*10);
		}
		queue.display();
		queue.deque();
		queue.display();
		System.out.println();
		System.out.println(queue.first());
		System.out.println();
		System.out.println(queue.isempty());
		System.out.println(queue.size());
	}

}
