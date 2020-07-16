package array;

import java.util.Scanner;

public class maxofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int[] arr;
		
		 arr= new int[4];
		 int i,j;
		 for(i=0;i<arr.length;i++)
		 {
			 arr[i]=scn.nextInt();
		 }	 
			j=max(arr);
			 System.out.print("Max numer is: "+j);
		 
		 

	}
	
	public static int max(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{if(arr[i]>max) max=arr[i];
		}	return max;
	}

}
