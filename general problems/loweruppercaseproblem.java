package lecture2;

import java.util.Scanner;

public final class loweruppercaseproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LOWER UPPER
//		Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.
//
//
//		Input Format:
//		Single Character .
//
//		Constraints:
//		-
//
//		Output Format:
//		lowercase UPPERCASE Invalid
//
//		Sample Input:
//		$
//		Sample Output:
//		Invalid
		
		Scanner scn=new Scanner(System.in);
		char c=scn.next().charAt(0);
		int i=(int) c;
		if(i>=65&&i<=90) System.out.println("UPPERCASE");
		
		else	if(i>=97&&i<=122) System.out.println("lowercase");
		else System.out.println("invalid");
		


	}

}
