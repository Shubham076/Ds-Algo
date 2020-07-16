package array;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[5];
		int c;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
        insertionsort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}
	public static void insertionsort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{ int value=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>value)
		{
			arr[j+1]=arr[j];
			j--;
		}
			arr[j+1]=value;
			
		}
		
	

	}

}
