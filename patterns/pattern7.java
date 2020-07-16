package Lecture1;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nst=no of stars nsp=no of spaces
		Scanner scn=new Scanner(System.in);
				int n=scn.nextInt();
				int i,j,nst=n/2,nsp=1;
				for(i=1;i<=n;i++)
				{  //stars
					for(j=1;j<=nst;j++)
					{
						System.out.print("*");
					}//spaces
					for(j=1;j<=nsp;j++)
					{
						System.out.print(" ");
					}//stars
					for(j=1;j<=nst;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					if(i<=n/2)
						{nst=nst-1;
						nsp=nsp+2;}
					else 
					{	nst=nst+1;
							nsp=nsp-2;}
				}
				
	}

}
