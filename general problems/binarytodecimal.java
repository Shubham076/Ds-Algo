package lecture2;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		 int n=scn.nextInt();
		 int i,p=1,no=0;
		 for(i=n;i>0;i=i/10)
		 {
			 no=no+i%10*p;
			 p*=2;
		 }
		 System.out.print(no);


	}

}
