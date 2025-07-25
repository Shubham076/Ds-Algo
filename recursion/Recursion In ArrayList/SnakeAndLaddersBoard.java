import java.util.ArrayList;

public class SnakeAndLaddersBoard {
//calculate all the possiblw ways to get number 10 by throwing dice;
	public static void main(String[] args) {
		System.out.print(getpath(0, 6));
		// printpath(0,3,"");
		// System.out.println();
		// System.out.println(printpath(0,10));
	}

	public static ArrayList<String> getpath(int cur, int end) {

		if (cur == end) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		if (cur > end) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;

		}
		ArrayList<String> rr = null;
		ArrayList<String> myresult = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			rr = getpath(cur + dice, end);
			// all the path from 1 to n;

			for (int i = 0; i < rr.size(); i++) {

				myresult.add(dice + rr.get(i));
				// add i to make all the path from 0 to n;
			}
		}
		return myresult;
	}

	public static void printpath(int cur, int end, String ans) {
		if (cur == end) {
			System.out.println(ans);
			return;
		}
		if (cur > end)
			return;


		for (int dice = 1; dice <= 6; dice++) {
			printpath(cur + dice, end, ans + dice);
		}
	}


	public static int printpath(int cur, int end) {
		if (cur == end) {
			return 1;
		}
		if (cur > end)
			return 0;

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += printpath(cur + dice, end);
		} return count;
	}

}