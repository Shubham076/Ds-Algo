package recursion;

import java.util.ArrayList;

public class subsequences {

	// Total subsequence  = 2^n
	public static void main(String[] args) {

		System.out.println(getss("abc"));

		// get("abc","");

	}

	public static ArrayList<String> getss(String str)

	{
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1); 

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getss(ros);

		for (int i = 0; i < recresult.size(); i++) {
			myresult.add(recresult.get(i));
			myresult.add(cc + recresult.get(i));
		}
		return myresult;

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
