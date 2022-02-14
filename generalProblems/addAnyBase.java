import java.util.Scanner;
class addAnyBase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int base = scn.nextInt();
        add(a , b , base);
        scn.close();
}

    public static void add(int a , int b , int base){
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
        System.out.println(ans);
    }
}