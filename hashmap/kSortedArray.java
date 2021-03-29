import java.util.*;
class kSortedArray{
	public static void main(String[] args){
		int[] arr = {3, 2, 4, 1, 6, 5, 7, 9, 8};
		int k = 3;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i = 0; i <= k; i++){
			q.add(arr[i]);
		}

		for(int i = k + 1; i < arr.length; i++){
			System.out.println(q.remove());
			q.add(arr[i]);
		}

		while(q.size() > 0){
			System.out.println(q.remove());
		}		
	}
}