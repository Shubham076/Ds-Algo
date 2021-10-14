/*
each friend have 2 choices whether to do pairing or not
let friends be 123
case 1: 1 decide not to do pairing so ans  = no of ways = f(n - 1) where n be the number of friends
means mein aklela rhunga baki 2 bndo ke jitne ways h pairing k mere bhi utne h

case 2: 1 decide to do pairing so ans = no of ways = (as 1 can do pairing with n - 1 friends) = (n - 1) * f(n - 2)
eg 1,2,3,4
1 decide to do pairing with 2 no of ways  = no of ways of 3,4 --i
1 decide to do pairing with 3 no of ways  = no of ways of 2,4---ii
1 decide to do pairing with 4 no of ways  = no of ways of 2,3---iii
total = i + ii + iii
//so final recurrence relation f(n) = f(n - 1) + (n - 1) * f(n - 2); 
*/

import java.util.Scanner;
class friendsPairing{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2; // 2 ways eg 12 => [1, 2] and [12]

		for(int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
		}

		System.out.println(dp[n]);
		print("1234" , "");	
	}


// printing of the pais by recursion
	public static void print(String s ,  String ans){		
		if(s.length() == 0){
			System.out.println(ans);
			return;
		}
		char c = s.charAt(0);
		String ros = s.substring(1);

		//when pairing is not done
		print(ros , ans + c + "-");

		//when pairing is done
		for(int i = 0 ; i < ros.length(); i++){
			String rem = ros.substring(0 , i) + ros.substring(i + 1);
			print(rem , ans + c + ros.charAt(i) + "-");
		}
	}
}