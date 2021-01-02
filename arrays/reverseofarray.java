

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[5]; 
		int[] a=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			a[i]=arr[j];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
