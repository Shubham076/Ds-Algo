import java.util.Scanner;
class maximumSumNonAdjacents{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scn.nextInt();
		}
		scn.close();

		int inc = arr[0];
		int exc = 0;
		for(int i = 1; i < arr.length; i++){
			int nInc = exc + arr[i];
			int nExc = Math.max(inc , exc);

			inc = nInc;
			exc = nExc;
		}

		System.out.println(Math.max(inc , exc));
	}
}