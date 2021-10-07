import java.util.ArrayList;

// this.compareTo(other)
// if it is +ve means this is greater
// if it is 0 mean both are equal
// if it is -ve means this is smaller 
public class Heap <T>{
	private ArrayList<T> data;

	public Heap(){
		data = new ArrayList<>();
	}

	private void swap(int i , int j){
		T one = data.get(i);
		T two = data.get(j);
		data.set(i , two);
		data.set(j , one);
	}

	private boolean isSmaller(int i , int j){
		Comparable ith = (Comparable)data.get(i);
		Comparable jth = (Comparable)data.get(j);
		return ith.compareTo(jth) < 0;
	}

	public void add(T val){
		data.add(val);
		upheapify(data.size() - 1);
	}

// O(Logn) logn is the height of the tree
	private void upheapify(int i){
		if(i == 0){
			return;
		}

		//parent of the ith index
		int pi = (i - 1) / 2;
		if(isSmaller(i , pi)){
			swap(i , pi);
			upheapify(pi);
		}
	}

	public T remove(){
		if(data.size() == 0){
			System.out.println("Heap underflow");
			return null;
		}
		swap(0 , data.size() - 1);
		T val = data.remove(data.size() - 1);
		downheapify(0);
		return val;
	}

// O(Logn) logn is the height of the tree
	private void downheapify(int pi){
		int min = pi;
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;

		if(li < data.size() && isSmaller(li , min)){
			min = li;
		}

		if(ri < data.size() && isSmaller(ri , min)){
			min = ri;
		}

		if(min != pi){
			swap(pi , min);
			downheapify(min);
		}
	}	

	public T peek(){
		if(data.size() == 0){
			System.out.println("Heap underflow");
			return null;
		}
			return data.get(0);
	}

	public int size(){
		return data.size();
	}

	public void display(){
		for(int i = 0; i < data.size(); i++){
			System.out.print(data.get(i) + " ");
		}
	}
}
