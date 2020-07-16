package lecture2;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
//		
//		Given a integer as a input and replace all the '0' with '5' in the integer
//
//
//		Input Format:
//		Enter an integer n
//
//		Constraints:
//		0<=n<=1000000000000
//
//		Output Format:
//		All zeroes are replaced with 5
//
//		Sample Input:
//		102
//		Sample Output:
//		152
		
		 Scanner scn=new Scanner(System.in);
          int n=scn.nextInt();
          int i,j,pos=0,r;              //pos= position
          
          if(n==0) System.out.println("5");
          
          else
          { for(i=n;i>0;i=i/10)
          {
        	r=i%10;
        	if(r==0)
        	{
        		j=(int)Math.pow(10, pos);
        		n=n+(5*j);
        		
        	}pos++;
          } System.out.println(n);
          }
	}

}
