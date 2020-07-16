package recursion;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		System.out.println(fibo(n));

	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) return n;
		if(n==1) return n;
		int f1=fibo(n-1);
		int f2=fibo(n-2);
		int fn=f1+f2;
		
		
		return fn;
	}

}
