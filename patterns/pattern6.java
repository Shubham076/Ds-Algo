package Lecture1;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}

	
	
	
	for(i=i-2;i>0;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}System.out.println();
	}

}

	}


