package linkedlist;

public class queusingll {
	
		private linkedlist list;
		public queusingll()
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
		
		public void enqueue(int data)throws Exception
		{
			list.addfirst(data);
		}
		
		public int dequeue()throws Exception
		{
			int rv=list.removeatlast();
			return rv;
		}
		public void display()throws Exception
		{
			list.reverseDI();
			list.display();
			list.reverseDI();
		}
		
}
