package Lecture1;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i, j, nst = 1, N = (2 * n) - 1;
		int val=1;
		
		for (i = 1; i <= N; i++)
		{    
			if (i <= (N / 2)+1)
				val=i;
			else
				val = N - i + 1;
			for (j = 1; j <= nst; j++)
			{
				
				
				if (j % 2 == 0)
				{
					System.out.print("*");
				}
				else                                   // N stands for total number of rows that is 9
				{
					System.out.print(val);
				}
			}
				System.out.println();

				if (i <= N / 2)
					nst = nst + 2;
				else
					nst = nst - 2;
				
				

			}

		}
	}

