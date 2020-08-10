package recursion;

public class paranthesisproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paranthesis("", 2, 2);
	}

	public static void paranthesis(String str, int leftb, int rightb) {
		if (leftb == 0 && rightb == 0) {
			System.out.println(str);
			return;
		}
		if (leftb > rightb) {
			return;
		}
		if (leftb > 0) {
			paranthesis(str + "{", leftb - 1, rightb);
		}

		if (rightb > 0) {
			paranthesis(str + "}", leftb, rightb - 1);
		}

	}
}
