class powerlog {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int ans =  power(x , n);
        System.out.println(ans);
    }

    public static int power(int x , int n) {
        if (n == 0) {
            return 1 ;
        }

        int hp = power(x , n / 2);  //hp = half of  power
        int xn = hp * hp;

        if (n % 2 == 1) {
            if (n > 0)
                return xn * x;
            else
                return (xn * xn) / x;
            // for negative power
        }
        return xn;
    }
}