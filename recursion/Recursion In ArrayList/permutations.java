import java.util.ArrayList;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aabc";
		System.out.println(getpermutation(a));

		printpermutations(a, "");

	}

	public static ArrayList<String> getpermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> recresult = getpermutation(ros); //// recresult is recursion result;

		for (int i = 0; i < recresult.size(); i++)

		{
			String rrs = recresult.get(i);

			for (int j = 0; j <= rrs.length(); j++) {
				String a = rrs.substring(0, j) + cc + rrs.substring(j);
				myresult.add(a);
			}
		}
		return myresult;

	}

	public static void printpermutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			printpermutations(roq, ans + ch);
		}
	}
}
