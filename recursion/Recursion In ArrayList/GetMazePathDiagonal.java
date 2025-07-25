import java.util.ArrayList;

public class GetMazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getmazepathd(0, 0, 2, 2));
		System.out.println();
		printMazePathD(0,0,2,2,"");
	}

	public static ArrayList<String> getmazepathd(int sr, int sc, int er, int ec) {
		// sr = start row,  er = end row
		if (sr == er && sc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		if (sr > er || sc > ec) {
            return new ArrayList<>();
		}

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> rrh = getmazepathd(sr, sc + 1, er, ec);
		for (String rrsh : rrh) {
			myResult.add("H" + rrsh); /// recursive result string horizontal
		}
		ArrayList<String> rrv = getmazepathd(sr + 1, sc, er, ec);
		for (String rrsv : rrv) {
			myResult.add("V" + rrsv);
		}
		ArrayList<String> rrd = getmazepathd(sr + 1, sc + 1, er, ec);
		for (String rrsd : rrd) {
			myResult.add("D" + rrsd);
		}
		return myResult;
	}
	public static void printMazePathD(int sr, int sc, int er, int ec, String ans) {
		if(sr == er && sc == ec) {
			System.out.println(ans);
			return;
		}
		if(sr > er || sc > ec)
			return;
		
		//horizontal movement
		printMazePathD(sr, sc + 1, er, ec, ans + "H");
		
		//vertical movement
		printMazePathD(sr + 1, sc, er, ec, ans + "V");
		
		//diagonal movement
		printMazePathD(sr + 1, sc + 1, er, ec, ans + "D");
	}
}
