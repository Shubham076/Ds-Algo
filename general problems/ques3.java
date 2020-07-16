package lecture2;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PRINT SERIES
//		Take the following as input.
//
//		A number (N1)
//		A number (N2)
//		Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
//
//
//		Constraints:
//		0 < N1 < 100 
//		0 < N2 < 100
//
//		Sample Input:
//		10 
//		4
//		Sample Output:
//		5 
//		11 
//		14 
//		17 
//		23 
//		26 
//		29 
//		35 
//		38 
//		41
		
		Scanner scn=new Scanner(System.in);
		 int N1=scn.nextInt();
		 int N2=scn.nextInt();
		 int i,no;
		 
		 for(i=1;i<=N1;i++)
		 {
			 no=3*i+2;
			 if(no%N2!=0)
			 {
				 System.out.println(no);
			 }
			 else N1++; 
			 
			 
		 }

	}

}
