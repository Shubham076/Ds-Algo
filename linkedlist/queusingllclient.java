package linkedlist;

public class queusingllclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		queusingll queue=new queusingll();
		
		for(int i=1;i<=5;i++)
		{
			queue.enqueue(i*10);
		}
		queue.display();
		queue.dequeue();
		queue.display();
		
		System.out.println(queue.size());

	}

}
