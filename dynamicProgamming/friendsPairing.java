import java.util.Scanner;
class friendsPairing{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		for(int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + (n - 1) * dp[n - 2];
		}

		System.out.println(dp[n]);
		print("123" , "");	
	}


// printing of the pais by recursion
	public static void print(String s ,  String ans){		
		if(s.length() == 0){
			System.out.println(ans);
			return;
		}
		char c = s.charAt(0);
		String ros = s.substring(1);
		print(ros , ans + c + "-");
		for(int i = 0 ; i < ros.length(); i++){
			String rem = ros.substring(0 , i) + ros.substring(i + 1);
			print(rem , ans + c + ros.charAt(i) + "-");
		}

	}
}