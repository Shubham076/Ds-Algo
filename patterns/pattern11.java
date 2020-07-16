package Lecture1;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 int n =scn.nextInt();
		 int i,j,N=1,nsp=n-1;
		 int val=1;
		 for(i=1;i<=n;i++)
		 {   val=i;
			 for(j=1;j<=nsp;j++)
			 {
				 System.out.print(" ");
				 
			 }	 
				 for(j=1;j<=N;j++)
				 {
					 System.out.print(val);
				 }
				 System.out.println();
				 N=N+2;
				 nsp=nsp-1;
		 }

	}

}
