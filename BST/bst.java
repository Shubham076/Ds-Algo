package BST;

public class bst {
	
	private class Node
	{
		int data;
		Node left;
		Node right;
		
		
	}
		private Node root;
		private int size;
		
		public bst(int[] arr)
		{
			this.root=construct(arr,0,arr.length-1);
		}
		
	private  Node  construct(int[] arr,int lo,int hi)  //lo is low  hi is high
	{
		if(lo>hi)
		{
			return null;
		}
		
		int mid=(lo+hi)/2;
		Node n=new Node();
		n.data=arr[mid];
		n.left=construct(arr,lo,mid-1);
		n.right=construct(arr,mid+1,hi);
		
		return n;
		
	}
	public void display()
	{
		this.display(this.root);
	}
	
	private  void display(Node node )
	{
		String str="";
	
		if(node.left!=null)
		{
			str=str+node.left.data+"=>";
		}
		else {str=str+"End=>";}
		str=str+node.data;
		if(node.right!=null)
		{
			str=str+"<="+node.right.data;
		}
		else
		{
			str=str+"<=End";
		}
		System.out.println(str);
		
		if(node.left!=null)
		{
			this.display(node.left);
		}
		if(node.right!=null)
		{
			this.display(node.right);
		}
	}
	
	public boolean find(int item)
	{
		return this.find(this.root,item);
	}
	
	private boolean find(Node node,int item)
	{
		if(node==null)
		{
			return false;
		}
		
		if(item>node.data)
		{
			return find(node.right,item);
		}
		else if(item<node.data)
		{
			return find(node.left.data);
		}
		else return true;
	}
	
	public int max()
	{
		return max(this.root);
	}
	
	private int max(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);	
		
	}
	
	public int min()
	{
		return min(this.root);
	}
	
	private int min(Node node)
	{
		if(node.left==null)
		{
			return node.data;
		}
		return min(node.left);	
		
	}
	public void add(int item)
	{
		add(this.root,item);
	}
	private void add(Node node,int item)
	{
		if(item>node.data)
		{
			if(node.right==null)
			{	
				Node n=new Node();
			     n.data=item;
			     node.right=n;
			     this.size++;
			}
			else {
				add(node.right,item);
			}
		}
		else
		{
			if(node.left==null)
			{	
				Node n=new Node();
			     n.data=item;
			     node.left=n;
			     this.size++;
			}
			else {
				add(node.left,item);
			}
			
		}
	}
	
	public void remove(int item)
	{
		this.root=remove(this.root,item);
	}
	public Node remove(Node node,int item)
	{  if(node==null)
	{
		return null;
	}
		if(item>node.data)
		{
			node.right=remove(node.right,item);
			return node;
		}
		else if(item<node.data)
		{
			node.left=remove(node.left,item);
			return node;
		}
		else
		{
			if(node.left==null&&node.right==null)
			{
				this.size--;
				return null;
			}
			else if(node.left==null){
				this.size--;
				return node.right;
			}
			
			else if(node.right==null)
			{
				this.size--;
				return node.left;
			}
			
			else {
				int lmax=this.max(node.left);
				node.data=lmax;
				node.left=remove(node.left,lmax);
				return node;
			}
		
		
	}
}
}

