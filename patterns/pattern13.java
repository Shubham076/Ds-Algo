package Lecture1;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 int n =scn.nextInt();
		 int i,j,No=1,nsp=n-1;   //No means how mant number
		 int val=1;
		 for(i=1;i<=n;i++)
		 {   
			 for(j=1;j<=nsp;j++)
			 {
				 System.out.print(" ");
				 
			 }	 val=1;
				 for(j=1;j<=No;j++)
				 {  
					 System.out.print(val);
					 val++;
				 } val=i-1;
				 for(j=1;j<=No-1;j++)
				 {   
					 System.out.print(val);
					 val--;
				 }
				 System.out.println();
				 No=No+1;
				 nsp=nsp-1;

	}

}
}
