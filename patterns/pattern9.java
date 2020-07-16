package Lecture1;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 int n =scn.nextInt();
		 int i,j,nst=1,nsp=2*n-3;
		 for(i=1;i<=n;i++)
		 {
			 for(j=1;j<=nst;j++)
			 {
				 System.out.print("*");
			 }

			 for(j=1;j<=nsp;j++)
			 {
				 System.out.print(" ");
			 }
			 j=1;
			 if(i==n) j=2;
			 for(;j<=nst;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
			 nst=nst+1;
			 nsp=nsp-2;
		 }
		 

	}

}
