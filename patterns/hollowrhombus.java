package Lecture1;

import java.util.Scanner;

public class hollowrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int i,j,nst=(n/2+1),nsp=0;
		 for(i=1;i<=n;i++)
		 {
			 for(j=1;j<=nst;j++)
			 {  if(j==nst)
				 System.out.print("*");
			 else
				 System.out.print(" ");
			 }
			 for(j=1;j<=nsp;j++)
			 {
				 System.out.print(" ");
			 }
			 if(i==1&&i==n)
				 j=2;
			 for(j=1;j<=nst;j++)
			 { if(j==1)
				 System.out.print("*");
			 else 
				 System.out.print(" ");
			 }
			 System.out.println();
			 if(i<=n/2)
			 {
				 nst=nst-1;
				 nsp=nsp+2;
			 }
			 else {
				 nst=nst+1;
				 nsp=nsp-2;
			 }
		 }


	}

}
