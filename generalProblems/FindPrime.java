public class FindPrime {
    public static void main(String[] args) {
            int n = 6;
            int count = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count > 0)
                System.out.println(n + " is not prime");
            else
                System.out.println(n + " is prime");
    }
}