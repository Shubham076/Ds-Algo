import java.util.ArrayList;

public class GetMazePath {
	public static void main(String[] args) {
		System.out.println(getMazePath(0, 0, 2, 2));
		System.out.println();
		getMazePath(0, 0, 2, 2, "");
		System.out.println();
		System.out.println(countmazepath(0, 0, 2, 2));
	}
	public static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) { ///sr=start row er end row
		if (sr == er && sc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		if (sr > er || sc > ec) {
            return new ArrayList<>();
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> rrh = getMazePath(sr, sc + 1, er, ec);
		for (String rrsh : rrh) {
			myResult.add("H" + rrsh);          // recursive result string horizontal
		}
		ArrayList<String> rrv = getMazePath(sr + 1, sc, er, ec);
		for (String rrsv : rrv) {
			myResult.add("V" + rrsv);
		}
		return myResult;
	}

	public static void getMazePath(int sr, int sc, int er, int ec, String ans) {
		if (sr == er && sc == ec) {
			System.out.println(ans);
			return;
		}

		if (sr > er || sc > ec)
			return;

		//horizontal movement
		getMazePath(sr, sc + 1, er, ec, ans + "H");

		//vertical movement
		getMazePath(sr + 1, sc, er, ec, ans + "V");
	}

	public static int countmazepath(int sr, int sc, int er, int ec) {
		if (sr == er && sc == ec) {

			return 1;
		}


		if (sr > er || sc > ec)
			return 0;
		int ch = 0, cv = 0;
		// horizontal movement
		ch = countmazepath(sr, sc + 1, er, ec);

		// vertical movement
		cv = countmazepath(sr + 1, sc, er, ec);

		int p = ch + cv;
		return p;
	}
}
