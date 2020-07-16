package Lecture1;

import java.util.Scanner;

public class notimeglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i,j,nsp=0,nst=n+1,nr=2*n+1,val=5;
		//here nr is total number of rows nsp no of spaces no is nst is no of stars 
		
		for(i=1;i<=nr;i++)
		{   
			for(j=1;j<=nsp;j++)
			{
				System.out.print(" ");
			}
			   if(i<=nr/2) val=n-i+1;
			   else  val=i-n-1;
			for(j=1;j<=nst;j++)
			{
				System.out.print(val);
				val--;
			} val=1;
			for(j=1;j<=nst-1;j++)
			{
				System.out.print(val);
				val++;
			} System.out.println();
			
			if(i<=nr/2)
			{
				nsp=nsp+1;
				nst=nst-1;
				
			}
			else {
				nsp=nsp-1;
				nst=nst+1;
				
			}
		}



	}

}
