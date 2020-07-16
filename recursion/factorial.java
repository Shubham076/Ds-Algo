package recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(Factorial(n));

	}
	public static int Factorial(int n)
	{
		if(n==0) return 1;
		else 
			return n*Factorial(n-1);
		
	}
}
