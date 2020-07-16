package recursion;

import java.util.ArrayList;

public class getmazemath {
	public static void main(String[] args) {
		
		System.out.println(getmazepath(0,0,2,2));
		
		System.out.println();
		System.out.println();
		
		getmazepath(0,0,2,2,"");
		System.out.println();
		
		System.out.println(countmazepath(0,0,2,2));
		
		
		}
	public static ArrayList<String> getmazepath(int sr,int sc,int er,int ec) ///sr=start row er end row
	{
		if(sr==er&&sc==ec)
		{
			ArrayList<String> baseresult=new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		
		if(sr>er||sc>ec)
		{
			ArrayList<String> baseresult=new ArrayList<>();
			
			return baseresult;
		}
		
		
		
		ArrayList<String> myresult=new ArrayList<>();
		ArrayList<String> rrh=getmazepath(sr,sc+1,er,ec);
		for(String rrsh:rrh)
		{
			myresult.add("H"+rrsh);            ///recursive result string horizontal
		}
		ArrayList<String> rrv=getmazepath(sr+1,sc,er,ec);
		for(String rrsv:rrv)
		{
			myresult.add("V"+rrsv);
		}
		return myresult;
	}
	
	public static void getmazepath(int sr,int sc,int er,int ec,String ans)
	{
		if(sr==er&&sc==ec)
		{
			System.out.println(ans);
			return;
		}
		if(sr>er||sc>ec)
			return;
		
		//horizontal movement
		getmazepath(sr,sc+1,er,ec,ans+"H");
		
		//vertical movement
		getmazepath(sr+1,sc,er,ec,ans+"V");
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
