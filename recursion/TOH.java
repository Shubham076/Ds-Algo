public class TOH {

    public static void main(String[] args) {

        int n = 3;
        int t1 = 1;
        int t2 = 2; 
        int t3 = 3;

        printInstructions(n,t1,t2,t3);
        
        
    }

    public static void printInstructions(int n , int t1, int t2, int t3){

        if( n == 0){
            return;
        }

        printInstructions(n-1, t1, t3, t2);

        System.out.println("["+t1+"-"+t2+"]");

        printInstructions(n-1, t3, t2, t1);
    }
    
}