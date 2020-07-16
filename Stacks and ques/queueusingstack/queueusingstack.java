package stacksandqueues;

public class queueusingstack  {
	private dynamicstack stack;
	private dynamicstack helper;
	
	public queueusingstack()throws Exception
	{
		this.stack=new dynamicstack();
		this.helper= new dynamicstack();
	}
	
	public boolean isempty()throws Exception
	{
		return this.stack.isempty();
	}
	
	public int size()
	{
		return this.stack.size();
	}
	
	public void enque(int item) throws Exception
	{
		this.stack.push(item);
	}
	
	public static void reversestack(stackusingarray stack, stackusingarray helper, int index) throws Exception {
		if (stack.isempty()) {
			return;
		}

			int item = stack.pop();
			reversestack(stack, helper, index + 1);
			helper.push(item);
			if (index == 0) {
				while (!helper.isempty()) {
					stack.push(helper.pop());
				}
			}
		}
	
	public int deque()throws Exception
	{
		while(this.stack.size()!=1)
		{
			this.helper.push(this.stack.pop());
		}
		int rv=this.stack.pop();
		while(!this.helper.isempty())
		{
			this.stack.push(this.helper.pop());
		}
		return rv;
	}
	
	public int front()throws Exception
	{
		while(this.stack.size()!=1)
		{
			this.helper.push(this.stack.pop());
		}
		int rv=this.stack.pop();
		while(!this.helper.isempty())
		{
			this.stack.push(this.helper.pop());
		}
		return rv;
	}
	
	public void display()throws Exception
	{
		reversestack(stack,helper,0);
		this.stack.display();
		reversestack(stack,helper,0);
	}
}
