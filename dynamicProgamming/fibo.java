import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		
		int[] storage=new int[n+1];
		
		System.out.println(fibo(n,storage));
		
		System.out.println("iterative------------");
		
		System.out.println(fibonacci(n));
		
		
	}

	private static int fibo(int n, int[] storage) {
	
		if(n==0) return n;
		if(n==1) return n;
		
		
		if(storage[n]!=0) return storage[n];
		
		int fn1 = fibo(n-1,storage);
		int fn2 = fibo(n-2,storage);
		
		int fn = fn1 + fn2;
		storage[n] = fn;
		
		return fn;
	}
		public static int fibonacci(int n)
		{
			int[] storage = new int[n+1];
			
			storage[0] = 0;
			storage[1] = 1;
			
			for(int i = 2; i < storage.length; i++)
			{
				storage[i] = storage[i-1] + storage[i-2];
			}
			return storage[n];			}
}
