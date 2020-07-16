package Lecture1;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
				int n=scn.nextInt();
				int i,j,nst=1,nsp=n/2;
				for(i=1;i<=n;i++)
				
			{
					for(j=1;j<=nsp;j++)
					{
						System.out.print(" ");
					
					}
					for(j=1;j<=nst;j++)
					{
						System.out.print("*");
					} System.out.println();
					if(i<=n/2)
					{
						nst=nst+2;
						nsp=nsp-1;
					}
					else {
						nst=nst-2;
						nsp=nsp+1;
					}
			}       
				

	}
}
