import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int i, p = 1, no = 0;
		for (i = n; i > 0; i = i / 2) {
			no = no + i % 2 * p;
			p *= 10;
		}
		System.out.print(no);

	}

}

