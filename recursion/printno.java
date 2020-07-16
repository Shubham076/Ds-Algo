package recursion;

import java.util.Scanner;

public class printno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		print(n);
		System.out.println();
		printI(n);
		System.out.println();
		PDISKIP(n);
	}
	
	//decreasing
	public static void print(int n)
	{  if(n==0) return;
		System.out.println(n);
		print(n-1);
	}
	
	//increasing
	public static void printI(int n)
	{  if(n==0) return;
		
		printI(n-1);
		System.out.println(n);
	}
	///PDISKIP
	public static void PDISKIP(int n)
	{  if(n==0) return;
		if(n%2==1)  System.out.print(n+" ");
		
		PDISKIP(n-1); 
		
		if(n%2==0)
		System.out.print(n+" ");

	}
}  
