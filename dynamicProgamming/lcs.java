import java.util.*;
class lcs{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        scn.close();
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        int m = x.length;
        int n = y.length;

        System.out.println("length of lcs is " + lcsDp(x, y, m, n));
    }

    // recursive solution time complexity of o(2^n)
    public static int Lcs(char[] x, char[] y, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }

        else if (x[m - 1] == y[n - 1]) {

            return 1 + Lcs(x, y, m - 1, n - 1);

        }

        else {
            return (int) Math.max(Lcs(x, y, m - 1, n), Lcs(x, y, m, n - 1));
        }

    }

    // dynamic approach as a lot of subproblems are solved twice

    public static int lcsDp(char[] x, char[] y, int m, int n) {

        int[][] L = new int[m + 1][n + 1];

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

        System.out.println("-------------------------");

        for(int i = 0; i < L.length ; i++){
            for(int j = 0; j < L[0].length; j++){
                System.out.print(L[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        return L[m][n];
    }
}