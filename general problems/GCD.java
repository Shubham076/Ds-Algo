package Lecture1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int GCD=1,i=1;
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		Scanner p=new Scanner(System.in);
		int num2=s.nextInt();
		while(i<=num1&&i<=num2) {
			if(num1%i==0&&num2%i==0)
				GCD=i;
			i++;
		}System.out.println(GCD);

	}

}
