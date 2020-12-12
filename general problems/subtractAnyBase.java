import java.util.Scanner;

public class subtractAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int base = scn.nextInt();
        scn.close();

        subtract(a, b, base);
    }

    private static void subtract(int a, int b, int base) {
        int carry = 0;
        int ans = 0;
        int  p = 1;

        // here b > a
        while(b > 0){
            int d1 = a % 10;
            int d2 = b % 10;
            a /= 10;
            b /= 10;

            int diff = 0;
            d2 = d2 + carry;

            if(d2 >= d1){
                diff = d2 - d1;
            } else {
                // here we have taken an borrow for the next itertion we have added a carry of  -1
                carry = -1;
                diff = d2  + base - d1;
            }

            ans += diff * p;
            p *= 10;
        }

        System.out.println(ans);
    }
}
