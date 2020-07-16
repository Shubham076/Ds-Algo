package Lecture1;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i,j;
		for(i=5;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}

	}

}
