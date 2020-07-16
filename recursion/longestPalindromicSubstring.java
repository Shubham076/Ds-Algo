import java.util.Scanner;

class LPS {

    private int start;
    private int maxlength;

    public static final String ANSI_RED = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public String lps(String s) {

        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {

            expandPalindrome(s, i, i); // for handling the odd cases
            expandPalindrome(s, i, i + 1); // for handling even cases
        }

        return s.substring(start, start + maxlength);
    }

    public void expandPalindrome(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        if (maxlength < right - left - 1) {

            start = left + 1;
            maxlength = right - left - 1;
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input string:");
        String input = scn.next();
        scn.close();

        LPS l = new LPS();
        System.out.println( ANSI_RED + l.lps(input) + ANSI_RESET);

    }
}