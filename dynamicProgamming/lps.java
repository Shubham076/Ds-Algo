class LPS {

    String str;
    String rev;
    int[][] L;

// the solution of reversing a string and finding longest palindromic substrind does not always works... 
    public LPS(String str) {

        this.str = str;

    }

    private void reverse() {

        String ans = "";

        for (int i = this.str.length() - 1; i >= 0; i--) {
            ans += this.str.charAt(i);
        }

        this.rev = ans;

    }

    private int lcs(char[] x, char[] y, int m, int n) {

        L = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                }

                else if (x[i - 1] == y[j - 1]) {
                    L[i][j] = 1 + L[i - 1][j - 1];

                }

                else {
                    L[i][j] = (int) Math.max(L[i][j - 1], L[i - 1][j]);
                }

            }

        }
        return L[m][n];
    }

    private char[] display(int length, int m, int n, char[] x, char[] y) {

        char[] ans = new char[length];
        int i = m;
        int j = n;

        while (i > 0 && j > 0) {

            // if current character is in both string then it is part of lps
            if (x[i - 1] == y[j - 1]) {

                ans[length - 1] = x[i - 1];
                i--;
                j--;
                length--;
            }
            // if not equal find the larger of two and go in the direction of larger value
            else if (this.L[i - 1][j] > this.L[i][j - 1]) {
                i--;
            } else
                j--;
        }

        return ans;

    }

    // using dynamic programming
    public String lpsDp() {

        this.reverse();

        char[] x = this.str.toCharArray();
        char[] y = this.rev.toCharArray();
        int m = x.length;
        int n = y.length;

        int length = this.lcs(x, y, m, n);
        char[] ans = this.display(length, m, n, x, y);

        String str = new String(ans);
        return str;
    }

    // using recursion

    public int lps(int i, int j) {

        char[] x = this.str.toCharArray();

        // if only one character is present
        if (i == j) {
            return 1;
        }
        if (x[i] == x[j] && i + 1 == j) {
            return 2;
        }

        else if (x[i] == x[j]) {

            return lps(i + 1, j - 1) + 2;

        } else {
            return (int) Math.max(lps(i, j - 1), lps(i + 1, j));
        }
    }

    public static void main(String[] args) {

        LPS l = new LPS("GEEKSFORGEEKS");
        int n = l.str.length();

        // System.out.println("longest palindromic subsequence is:" + l.lpsDp());
        System.out.println("length of longest palindromic subsequence is:" + l.lps(0, n - 1));

    }
}