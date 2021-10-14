import java.util.Scanner;
import java.util.Stack;
class stockSpan{
	// 7
	//       100 80 60 70 60 75 85
	// output 1   1  1  2  1  4  6 
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scn.nextInt();
		}

		stock(arr);
	}

	public static void stock(int[] arr){
		int[] span = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		s.push(0);
		span[0] = 1;

		for(int i = 1; i < arr.length; i++){

			while(s.size() > 0 && arr[i] >= arr[s.peek()]){
				s.pop();
			}

			if(s.size() == 0){
				span[i] = i + 1;
			}
			else{
				span[i] = i - s.peek();
			}

			s.push(i);
		}

		for(int i : span){
			System.out.print(i+ " ");
		}
	}
}