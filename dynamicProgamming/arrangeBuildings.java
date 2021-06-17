/*arrange n building such that no two buildings come together

os => how many ways are there to arrange buildings and space such that last one is space
ob => how many ways are there to arrange buildings and space such that last one is building 
*/
import java.util.Scanner;
public class arrangeBuildings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        scn.close();

        long os = 1;  //old space
        long ob = 1;  //old buildings

        //start from when buildings are 2
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
