package Lecture1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fn=0,sn=1,counter=0,next;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
	while(counter<N) {
		next=fn+sn;
		fn=sn;
		sn=next;
		counter++;
		
	}System.out.println(fn);

	}

}
