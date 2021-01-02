

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[5];
		int c;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
        bubblesort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}
	public static void bubblesort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		
	}
}
