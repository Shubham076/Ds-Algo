import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev = 0;
		int r;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		while(num > 0)
		{
		   r = num % 10;
		   rev = rev * 10 + r;
		   num = num / 10;}
		

		System.out.println(rev);
	}
}
