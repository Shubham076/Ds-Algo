//recurrence relation of nCk = (n - 1)Ck + (n-1)C(k - 1)
class binomialCoefficient {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println("Value of C(" + n + "," + k + ") is " + binomialCoeff(n, k));
    }

    public static int min(int a, int b) {
        return (a < b) ?  a : b;
    }

    public static int binomialCoeff(int n, int k) {
        int C[][] = new int[n + 1][k + 1];

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= min(i, k); j++) {
                // Base Cases nC0 == nCn == 1
                if (j == 0 || j == i)
                    C[i][j] = 1;

                // Calculate value using previously stored values
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
        return C[n][k];
    }
}