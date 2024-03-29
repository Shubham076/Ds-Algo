import java.util.*;
public class removePrimes {

    public static void solution(ArrayList < Integer > al) {
        // write your code here
        
        for(int i = al.size() - 1 ; i >= 0; i--){
            int n = al.get(i);
            if(n == 1){
                continue;
            }
            if(checkPrime(n)){
                al.remove(i);
            }
        }
    }
    
    public static boolean checkPrime(int n){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of arrayList: ");
        int n = scn.nextInt();
        ArrayList < Integer > al = new ArrayList < > ();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}
