package recursion;

import java.util.ArrayList;

public class getmazepathdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getmazepathd(0, 0, 2, 2));
		
		System.out.println();
		printmazepathd(0,0,2,2,"");

	}

	public static ArrayList<String> getmazepathd(int sr, int sc, int er, int ec) /// sr=start row er end row
	{
		if (sr == er && sc == ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		if (sr > er || sc > ec) {
			ArrayList<String> baseresult = new ArrayList<>();

			return baseresult;
		}

		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> rrh = getmazepathd(sr, sc + 1, er, ec);
		for (String rrsh : rrh) {
			myresult.add("H" + rrsh); /// recursive result string horizontal
		}
		ArrayList<String> rrv = getmazepathd(sr + 1, sc, er, ec);
		for (String rrsv : rrv) {
			myresult.add("V" + rrsv);
		}
		ArrayList<String> rrd = getmazepathd(sr + 1, sc + 1, er, ec);
		for (String rrsd : rrd) {
			myresult.add("D" + rrsd);
		}
		return myresult;
	}
	public static void printmazepathd(int sr,int sc,int er,int ec,String ans)
	{
		if(sr==er&&sc==ec)
		{
			System.out.println(ans);
			return;
		}
		if(sr>er||sc>ec)
			return;
		
		//horizontal movement
		printmazepathd(sr,sc+1,er,ec,ans+"H");
		
		//vertical movement
		printmazepathd(sr+1,sc,er,ec,ans+"V");
		
		//diagonal movement
		printmazepathd(sr+1,sc+1,er,ec,ans+"D");
	}
}
