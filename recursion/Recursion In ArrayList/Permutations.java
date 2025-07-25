import java.util.ArrayList;
public class Permutations {
	public static void main(String[] args) {
		String a = "abc";
		System.out.println(getPermutation(a));
		printPermutations(a, "");
	}

	public static ArrayList<String> getPermutation(String str) {
		if (str.isEmpty()) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getPermutation(ros); //// recResult is recursion result;

		for (String s: recResult){
			for (int j = 0; j <= s.length(); j++) {
				String a = s.substring(0, j) + cc + s.substring(j);
				myResult.add(a);
			}
		}
		return myResult;
	}

	public static void printPermutations(String ques, String ans) {
		if (ques.isEmpty()) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			printPermutations(roq, ans + ch);
		}
	}
}
