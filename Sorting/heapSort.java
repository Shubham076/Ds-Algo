import java.util.*;

public class heapSort {

	public static void swap(int i, int j, ArrayList<Integer> arr){
		int ith = arr.get(i);
		int jth = arr.get(j);
		arr.set(i, jth);
		arr.set(j, ith);
	}

	public static void downheapify(ArrayList<Integer> arr, int n, int pi){
		int max = pi;
		int li = 2 * pi + 1;
		int ri = 2 * pi + 2;
		if(li < n && arr.get(li) > arr.get(max)){
			max = li;
		}
		if(ri < n && arr.get(ri) > arr.get(max)){
			max = ri;
		}
		if(max != pi){
			swap(pi, max, arr);
			downheapify(arr, n, max);
		}
	}

	public static void sort(ArrayList<Integer> arr){
		int n = arr.size();
		for(int pi = n / 2 - 1; pi >= 0; pi--){ // pi = parent index
			downheapify(arr, n, pi);
		}
		for(int i = n - 1; i > 0; i--){
			swap(0, i, arr);
			downheapify(arr, i, 0);
		}
	}
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
        	arr.add(scn.nextInt());
        }

        sort(arr);
        System.out.println(arr);
        
    }
}
