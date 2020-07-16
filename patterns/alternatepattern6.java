package Lecture1;

import java.util.Scanner;

public class alternatepattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nst=no of stars nsp=no of spaces
				Scanner scn=new Scanner(System.in);
						int n=scn.nextInt();
						int i,j,nst=1,N=(2*n)-1;
						for(i=1;i<=N;i++)
						{
							for(j=1;j<=nst;j++)
							{
								System.out.print("*");
							} System.out.println();
							
							if(i<=N/2) nst=nst+1;
							else nst--;
						}

	}

}
