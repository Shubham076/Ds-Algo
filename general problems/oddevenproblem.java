package lecture2;

import java.util.Scanner;

public class oddevenproblem {
			 
	public static void main(String[] args) {
//	DELHI'S ODD EVEN
//	Due to growing Traffic Problem Kejriwal wants to devise a new scheme. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?
//
//
//	Input Format:
//	The first line contains N , then N integers follow each denoting the number of the car.
//
//	Constraints:
//	N<=1000
//	Car No >=0 && Car No <=1000000000
//
//	Output Format:
//	N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !
//
//	Sample Input:
//	2
//	12345
//	12134
//	Sample Output:
//	Yes
//	No
		
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(t=2;t>0;t--)
			{int N=scn.nextInt();
		 int i,r,sum1=0,sum2=0;
		 for(i=N;i>0;i=i/10)
		 {
			 r=i%10;
			 if(r%2==0)
			 sum1=sum1+r;
			 else sum2=sum2+r;
			 
		 }	 if(sum1%4==0||sum2%3==0) System.out.println("Yes");
		 else System.out.println("No");
			}
	}
}
