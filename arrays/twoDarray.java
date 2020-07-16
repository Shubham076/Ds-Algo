package array;

import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{                                                        //new int[3][0] is valid but reverse is not valid;
				arr[i][j]=scn.nextInt();
			}
			
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}

	}

}
