package recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		///System.out.println(fibo(n));
		
/////iterative approach
		int cnt=0,first=0,next=0,second=1;
		while(cnt<n)
		{
			next=first+second;
			first=second;
			second=next;
			cnt++;
		}  System.out.println(first);

		}
	public static int fibo(int n)
	{
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
}
