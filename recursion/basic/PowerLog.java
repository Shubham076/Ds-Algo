
class PowerLog {
    public static void main(String[] args) {
        int x = 2;
        int n = -2;
        double ans =  power(x ,n);
        System.out.println(ans);
    }

    public static double power(double x , int n){
        if (n == 0) {
            return 1.00000;
        }
        double power = power(x, n / 2);
        if (n % 2 == 0) {
            return power * power;
        } else {
            if (n > 0) {
                return power * power * x;
            } else {
                return (power * power) / x ;
            }
        }
    } 
}