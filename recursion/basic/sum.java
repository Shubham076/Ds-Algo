package recursion;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(sum(n10));

	}
	public static  int sum(int n)
	{
		if(n==0) return 0;
		else return n+sum(n-1);
	}
}
