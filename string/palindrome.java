public class palindrome {
	public static void main(String[] args) {

		String s = "NAMAN";
		String p = "Shubham";
		System.out.println(Palindrome(s));
		System.out.println(Palindrome(p));

	}

	public static boolean Palindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}

		return true;
	

}
}
