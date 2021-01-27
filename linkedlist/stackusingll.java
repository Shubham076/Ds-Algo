public class stackusingll {
	
	private linkedlist list;
	
		public stackusingll()
		{
			this.list=new linkedlist();
		}
		
		public boolean isempty()
		{
			return list.isempty();
		}
		
		public int size()
		{
			return list.size();
		}
		
		public void push(int data)
		{
			list.addfirst(data);
		}
		
		public int pop()throws Exception
		{
			int rv=list.removeatfirst();
			return rv;
		}
		
		public int top()throws Exception
		{
			return list.getfirst();
		}
		
		public void display()
		{
			list.display();
		}
}
