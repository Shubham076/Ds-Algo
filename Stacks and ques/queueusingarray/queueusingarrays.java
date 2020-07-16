package stacksandqueues;

public class queueusingarrays {
	private int[] data;
	private int size;
	private int front;
	
	
	public static final int defaultcapacity=10;
	
	public queueusingarrays() throws Exception
	{
		this(defaultcapacity);
	}
	public queueusingarrays(int capacity) throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("Invalid capacity");
		}
			 this.data=new int[capacity];
			this.front=0;
			this.size=0;
			
		
	}
	public int size()
	{
		return this.size;
	}
	
	public boolean isempty()
	{
		return (this.size()==0);
	}
	
	public void enque(int value) throws Exception
	{
		if(this.size==this.data.length)
		{
			throw new Exception("Queue is full");
			
		}
		int ai=(this.size+this.front)%this.data.length;
		this.data[ai]=value;
		this.size++;
	}
	
	public void deque() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Queue is empty");
			
		}
		int r=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
	
	}
	public int first() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Queue is empty");
			
		}
		int r=this.data[this.front];
		return r;
	}
	
	public void display()
	{
		for(int i=0;i<this.size();i++)
		{
			int ai=(this.front+i)%this.data.length;
			System.out.print(this.data[ai]+",");
			
		}System.out.println("End");
	}

}
