package string;

import java.util.Scanner;

public class printallsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		for(int si=0;si<a.length();si++)                 //si is starting index  //ei is ending index
		{
			for(int ei=si+1;ei<=a.length();ei++)
			{
				System.out.println(a.substring(si,ei));
			}
		}

	}

}
