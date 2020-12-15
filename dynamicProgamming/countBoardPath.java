

import java.util.Scanner;

public class countBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] str=new int[n+1];
		
		System.out.println(printpath(0,10,str)); ////str=storage
		
	}
	
	public static int printpath(int cur,int end,int[] str)
	{
		if(cur==end)
		{
			
			return 1;
		}
		if(cur>end)
			return 0;
		
		if(str[cur]!=0) return str[cur];
		
		int count=0;
		for(int dice=1;dice<=6;dice++)
		{
			count+=printpath(cur+dice,end,str);
			
			str[cur]=count;
			
		} return count;
	}


}
