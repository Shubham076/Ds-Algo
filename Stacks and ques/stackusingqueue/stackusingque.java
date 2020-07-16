package stacksandqueues;

public class stackusingque {
		private dynamicqueue queue;
		
		public stackusingque()throws Exception
		{
			this.queue=new dynamicqueue();
		}
		
		public int size()
		{
			return this.queue.size();
		}
		
		public boolean isempty()
		{
			return this.queue.isempty();
		}
		
		public void push(int data)throws Exception
		{
			this.queue.enque(data);
		}
		
		
		public static void reversequeue(dynamicqueue queue)throws Exception
		{
			if(queue.isempty())
			{
				return;
			}
			int val=queue.deque();
			reversequeue(queue);
			queue.enque(val);
		}
		
		public int pop()throws Exception
		{
				reversequeue(queue);
				int r=this.queue.deque();
				reversequeue(queue);
				return r;
		}
		
		public int top()throws Exception
		{
				reversequeue(queue);
				int r=this.queue.deque();
				reversequeue(queue);
				return r;
		}
		
		public void display()throws Exception
		{
			reversequeue(queue);
			this.queue.display();
			reversequeue(queue);
		}
}
