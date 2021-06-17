import java.util.*;
class countBinaryStrings{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int oc0 = 1;   //strings end at 0
        int oc1 = 1;   // strings end at 1

        for(int i = 2 ; i <= n; i++){
            int nc0 = oc1;
            int nc1 = oc1 + oc0;

            oc0 = nc0;
            oc1 = nc1;
        }

        System.out.println(oc0 + oc1);
    }
}