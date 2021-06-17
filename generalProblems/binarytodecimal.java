import java.util.Scanner;
public class binarytodecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int i, p = 1, no = 0;
		for (i = n; i > 0; i = i / 10) {
			no = no + i % 10 * p;
			p *= 2;
		}
		System.out.print(no);
	}
}
