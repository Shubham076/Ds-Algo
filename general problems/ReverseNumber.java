package Lecture1;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int r;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num>0)
		{
		   r=num%10;
		   rev=r+10*rev;
		   num=num/10;}
		

	System.out.println(rev);

	}}