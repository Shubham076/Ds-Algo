import java.util.ArrayList;
public class coinChangeCombination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 6};
		coinChangeCombination(arr, 10, "", 0);
		System.out.println("------------------");
		coinChangePermutation(arr, 10, "");
	}
	
	//Backtracking
	public static void coinChangeCombination(int[] denom, int amount, String ans, int lastDenomindex) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = lastDenomindex; i < denom.length; i++) {
			if (amount >= denom[i]) {
				coinChangeCombination(denom, amount - denom[i], ans + denom[i], i);
			}
		}
	}

	public static void coinChangePermutation(int[] denom, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < denom.length; i++) {
			if (amount >= denom[i]) {
				coinChangePermutation(denom, amount - denom[i], ans + denom[i]);
			}
		}
	}
}


