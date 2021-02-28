import java.util.Scanner;

public class arrangeBuildings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        scn.close();

        long os = 1;
        long ob = 1;

        for(long i = 2; i <= n; i++){
            long ns = ob + os;
            long nb = os;

            ob = nb;
            os = ns;
        }

        long total = os + ob;

        System.out.println(total * total);
    }
}
