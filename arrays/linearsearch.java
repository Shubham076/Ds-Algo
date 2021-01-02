

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int[] arr;
		arr=new int[5];
		int i,j=5,f=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==j)
				{f=1;
				break;}
		}if(f==0)
			System.out.print("Not found");
		else System.out.print("Found");
		

	}

}
