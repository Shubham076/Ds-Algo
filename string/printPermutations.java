public class printPermutations {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static void print(String s){
        int n = s.length();
        for(int i = 0 ; i < factorial(n); i++){
            StringBuilder temp = new StringBuilder(s);
            int divid = i;  //dividend

            for(int div = n; div > 0; div--){
                int r = divid % div;
                int q = divid / div;
                System.out.print(temp.charAt(r));
                temp.deleteCharAt(r);
                divid = q;
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        String s = "abc";
        print(s);
    }
}
