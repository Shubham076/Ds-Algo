

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[5];
		int c;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
        selectionsort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}
	public static void selectionsort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
	
		{	int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				min=j;
				
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
	}

	
}
