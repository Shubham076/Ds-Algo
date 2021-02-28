import java.util.Scanner;
class paintFence{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();    //colors

		// for two fences n = 2;
		long same = c * 1;  // same denotes = last two fences have same color
		long diff = c * (c - 1); // diff denotes =  last two fences have diff color
		long total = same + diff;

		for(int i = 3; i <= n; i++){
			same = diff * 1;
			diff = total * (c  - 1);
			total = same + diff;
		}

		System.out.println(total);
	}
}