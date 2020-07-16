package Heap;

import java.util.ArrayList;
import java.util.HashMap;

public class genericHeap <T  extends Comparable<T>>{

ArrayList<T> data=new ArrayList<>();
  HashMap<T,Integer> map=new HashMap<>();
	
	public void add(T item)
	{
		data.add(item);
		map.put(item,this.data.size()-1);
		upheapify(data.size()-1);
		
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi=(ci-1)/2;
		
		if(isLarger(data.get(ci),data.get(pi))>0)  //priority of child is greater than parent
		{
			swap(pi,ci);
			upheapify(pi);
		}
		
	}

	private void swap(int i, int j) {
		T ith=data.get(i);
		T jth=data.get(j);
		data.set(i, jth);
		data.set(j, ith);
		
		map.put(ith,j);
		map.put(jth,i);
		
	}
	public void display()
	{
		System.out.println(this.data);
		
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public int size()
	{
		return this.data.size();
	}
		
	public T remove()
	{
		swap(0,this.data.size()-1);
		
		T rv=this.data.remove(this.data.size()-1);
		
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		
		int lc=2*pi+1;
		int rc=2*pi+2; ////li=leftchild,    ri=right child  parent index;
		int min=pi;
		if(lc<this.data.size()&&isLarger(data.get(lc),data.get(min))>0)
		{
			min=lc;
		}
		if(rc<this.data.size()&&isLarger(data.get(rc),data.get(min))>0)
			min=rc;
		
		if(min!=pi)
		{
			swap(pi,min);
			downheapify(min);
		}
		
	}
	
	public T get()
	{
		return this.data.get(0);
	}
	
	public int isLarger(T t,T o) {
		return t.compareTo(o);           //priority of this is greater gives +ve value else gives -ve value
	}
	
	public void updatePriority(T pair) {
		int index=map.get(pair);
		upheapify(index);
	}
}
