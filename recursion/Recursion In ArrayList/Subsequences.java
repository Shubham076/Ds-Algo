import java.util.ArrayList;

public class Subsequences {

	// Total subsequence  = 2^n
	public static void main(String[] args) {
		System.out.println(getss("abc"));
		// get("abc","");
	}

	public static ArrayList<String> getss(String str) {
		if (str.isEmpty()) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getss(ros);

        for (String s : recResult) {
            myResult.add(s);
            myResult.add(cc + s);
        }
		return myResult;
	}

	// without using array list
	public static void get(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		get(ros, result);
		get(ros, ch + result);
	}
}
