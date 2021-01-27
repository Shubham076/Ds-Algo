import java.util.Scanner;
import java.util.Stack;
class largestAreaHistogram{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		area(arr);
	}

	public static void area(int[] arr){
		// next smaller element index on the right
		int[] rb = new int[arr.length];
		// next smaller element index on the left
		int[] lb = new int[arr.length];

		Stack<Integer> s = new Stack<>();
		s.push(arr.length - 1);
		rb[arr.length - 1] = arr.length;
		for(int i = arr.length - 2; i >= 0; i--){
			while(s.size() > 0 && arr[i] <= arr[s.peek()]){
				s.pop();
			}

			if(s.size() == 0){
				rb[i] = arr.length;
			}
			else{
				rb[i] = s.peek();
			}
			s.push(i);
		}

		s = new Stack<>();
		s.push(0);
		lb[0] = -1;
		for(int i = 1; i < arr.length; i++){
			while(s.size() > 0 && arr[i] <= arr[s.peek()]){
				s.pop();
			}

			if(s.size() == 0){
				lb[i] = -1;
			}
			else{
				lb[i] = s.peek();
			}
			s.push(i);
		}

		int maxArea = 0;
		for(int i = 0; i < arr.length; i++){
			int width = rb[i] - lb[i] - 1;
			int area  = arr[i] * width;
			if(area > maxArea){
				maxArea = area;
			}
		}
		System.out.println(maxArea);
	}
}