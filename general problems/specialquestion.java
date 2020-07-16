package lecture2;

import java.util.Scanner;

public class specialquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ques= Given a number and a value of k
		// suppose Number is 54632 if k=1 output is 25463 if k=-1  output is 46325
		//  if k=2 output is 32546    k=-2 63254
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int nod=0;  int i,num=0;    // nod=number of digits
		
		
		for(i=n;i>0;i=i/10)
		{
			nod++;
		}
		if(k>=0) k=k % nod;
		else  k=k+nod;
		int q=n/(int)Math.pow(10, k);
		int r=n%(int)Math.pow(10, k);
		
		num=r*(int)Math.pow(10, nod-k)+q;
		System.out.println(num);
		
		
	}

}
