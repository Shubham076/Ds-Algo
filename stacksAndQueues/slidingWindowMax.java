import java.util.Stack;
import java.util.Scanner;
class slidingWindowMax{
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < arr.length; i++){
		arr[i] = scn.nextInt();
	}
	int k = scn.nextInt();
	naive(arr , k);
  System.out.println();
  method2(arr , k); 
  }

  public static void naive(int[] arr , int k){
  	for(int i = 0 ; i <= arr.length - k; i++){
  		int max = Integer.MIN_VALUE;
  		for(int j = i; j < i + k; j++){
  			if(arr[j] > max){
  				max = arr[j];
  			}
  		}
  		if(max != Integer.MIN_VALUE)
  			System.out.print(max + " ");
  	}
  }

  public static void method2(int[] arr ,int k){
    Stack<Integer> s = new Stack<>();
    int[] ng = new int[arr.length];
    s.push(0);

    for(int i = 1; i < arr.length; i++){
      while(s.size() > 0 && arr[i] >= arr[s.peek()]){
        int idx = s.peek();
        ng[idx] = i;
        s.pop();
      }

      s.push(i);
    }

    while(s.size() > 0){
      int pos = s.peek();
      ng[pos] = arr.length;
      s.pop();
    }
    
    for(int i = 0; i <= arr.length - k; i++){
      int j = i;
      while(ng[j] < i + k){
        j = ng[j];
      }

      System.out.print(arr[j] + " ");
    }
  }
}