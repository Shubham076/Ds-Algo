public class Sum {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));

	}

	public static int sum(int n) {
		if (n == 0)
			return 0;
		else
			return n + sum(n - 1);
	}
}
