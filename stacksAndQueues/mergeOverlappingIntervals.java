import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
class mergeOverlappingIntervals{
	static class Pair implements Comparable<Pair>{
		int st;
		int et;
		public Pair(int st , int et){
			this.st = st;
			this.et = et;
		}

		@Override
		public int compareTo(Pair o){
			if(this.st == o.st){
				return this.et- o.et;
			}
			else
				return this.st - o.st;
		}

		@Override
		public String toString(){
			return "(" + this.st +"-" + this.et + ")";
		}
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Pair[] arr = new Pair[n];
		for(int i = 0; i < arr.length; i++){
			int s = scn.nextInt();
			int e = scn.nextInt();
			arr[i] = new Pair(s , e);
		}

		Arrays.sort(arr);
		Stack<Pair> s = new Stack<>();
		s.push(arr[0]);
		for(int i = 1; i < arr.length; i++){

			Pair top = s.peek();
			if(arr[i].st > top.et){
				s.push(arr[i]);
			} else {
				top.et = Math.max(top.et , arr[i].et);

			}
		
	}

	Stack<Pair> h = new Stack<>();
	while(s.size() > 0){
		h.push(s.pop());
	}

	while(h.size() > 0){
		System.out.println(h.pop());
	}

	}
}