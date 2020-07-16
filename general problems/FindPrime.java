package Lecture1;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(i<N) {
			if(N%i==0) {
				System.out.println("not prime");
				return;}
			i++;
		}if(N==i)
			System.out.println("prime");
		

	}

}
