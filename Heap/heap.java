
package Heap;

import java.util.ArrayList;

public class heap {
	
	ArrayList<Integer> data=new ArrayList<>();
	
	public void add(int item)
	{
		data.add(item);
		upheapify(data.size()-1);
		
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi=(ci-1)/2;
		
		if(data.get(ci)<data.get(pi))
		{
			swap(pi,ci);
			upheapify(pi);
		}
		
	}

	private void swap(int i, int j) {
		int ith=data.get(i);
		int jth=data.get(j);
		data.set(i, jth);
		data.set(j, ith);
		
	}
	public void display()
	{
		System.out.println(this.data);
		
	}
	
	public int size()
	{
		return this.data.size();
	}
		
	public int remove()
	{
		swap(0,this.data.size()-1);
		
		int rv=this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		
		int lc=2*pi+1;
		int rc=2*pi+2; ////li=leftchild,    ri=right child  parent index;
		int min=pi;
		if(lc<this.data.size()&&data.get(lc)<data.get(min))
		{
			min=lc;
		}
		if(rc<this.data.size()&&data.get(rc)<data.get(min))
			min=rc;
		
		if(min!=pi)
		{
			swap(pi,min);
			downheapify(min);
		}
		
	}
	
	public int get()
	{
		return this.data.get(0);
	}
}
