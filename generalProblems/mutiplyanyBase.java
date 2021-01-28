import java.util.Scanner;

public class mutiplyanyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int base = scn.nextInt();
        multiply(a , b , base);
        scn.close();
    }

    private static void multiply(int a, int b, int base) {

        int p = 1;
        int product = 0;
        while( b > 0){
            int d1 = b % 10;
            b /= 10;
            int sProduct = singleProduct(a , d1 , base);
            product = add(product,sProduct * p, base);

            p *= 10;
        }

        System.out.println(product);
    }

    public static  int singleProduct(int a , int d , int base){

        int p = 1;
        int ans = 0;
        int carry = 0;
         while( a > 0 || carry > 0){
            int d2 = a % 10;
             a /= 10;

             int product = d2 * d + carry;
             carry = product / base;
             ans += product % base * p;
             p *= 10;

         }

         return ans;
    }

    public static int add(int a , int b , int base){
        int carry = 0;
        int ans = 0;
        int  p = 1;
        while( a > 0 || b > 0 || carry > 0){
            int d1 = a % 10;
            int d2 = b % 10;

            a /= 10;
            b /= 10;
            int sum = d1 + d2 + carry;
            ans += sum % base * p;
            carry = sum / base;
            p *= 10;
        }

        return ans;
    }
}
