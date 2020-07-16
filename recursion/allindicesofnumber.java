package recursion;

import java.util.Scanner;

public class allindicesofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int[] arr= {4,2,4,5,9,8,4,8};
		 ///int[] ans=allindices(arr,0,4,0);
		 System.out.println(allindices(arr,0,4,0));


	}
		public static int[] allindices(int[] arr,int i,int data,int cnt)
		{  if(i==arr.length) {
			int[] base=new int[cnt];
			return base;
		}
			int[] indices=null;
			if(arr[i]==data)
			indices=allindices(arr,i+1,data,cnt+1);
			else
				indices=allindices(arr,i+1,data,cnt);
		if(arr[i]==data)
			indices[cnt]=data;
		return indices;
}
}
