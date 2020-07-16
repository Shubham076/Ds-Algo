package array;

import java.util.Scanner;

public class deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[10];
		
		System.out.print("Enter the no of elements of array:");
		int s=scn.nextInt();
		
		
		for(int i=0;i<s;i++)
		{
			System.out.print("Enter the number "+(i+1)+":");
			arr[i]=scn.nextInt();
		}
		
		System.out.print("\nEnter the position at which you want to delete:s");
		int pos=scn.nextInt();
		
		deletion(arr,s,pos);
		
		
			System.out.println("\nThe elements of array are:");
		
		for(int i=0;i<s-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		
	
	}
	public static void deletion(int[] arr,int size,int pos)
	{
		for(int i=pos-1;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
	}
}
