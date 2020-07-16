package stacksandqueues;

public class dynamicqueue extends queueusingarrays{
	
	public dynamicqueue() throws Exception
	{
		this(DEFAULT_CAPACITY);
		
		
	}
	public dynamicqueue(int capacity) throws Exception
	{
		super(capacity);
	}
	
	public void enque(int item) throws Exception
	{
		if(this.size()==this.data.length)
		{
			int[] arr=new int[2*this.data.length];
			for(int i=0;i<this.size();i++)
			{
				int ai=(this.front+i)%this.data.length;
				arr[i]=this.data[ai];
			}
			this.data=arr;
			this.front=0;
			
		}
		super.enque(item);
	}

}
