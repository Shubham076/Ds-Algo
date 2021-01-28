// consecutive number sum
// N = a + a + 1 + a + 2 + -----  a + n - 1 (where n is the number of the terms in the consecutive sum)
// as it is a ap and sum of ap (a + an)n/2 => n is the number of terms and an is last term ;
// N = (a + a + n - 1) *n / 2;
// a = (2N  + n - n * n) / 4* n
// a is positive so to balance the eqrhs should also be positive
import java.util.Scanner;
class consecutiveNumberSum{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int n = 2;
		int count = 0;
		scn.close();
		while((2 * N + n - n * n) > 0){
			double a = (float)(2 * N + n - n * n) / (2 * n);
			if(a  - Math.floor(a) == 0){
				count += 1;
			}
			n++;
		}

		System.out.println("Total ways : " + count);
	}
}