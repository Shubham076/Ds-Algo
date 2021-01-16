import java.util.Scanner;
public class generateParenthesis{
    public static void main(String args[]) throws Exception {
    	Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
        generate("" , 0 , 0 , n);
        scn.close();

    }

    public static void generate(String ans , int open, int close , int max){
        if(ans.length() == 2 * max){
            System.out.println(ans);
            return;
        }

        if(open < max){
            generate(ans + "(" , open + 1 , close , max);
        }
        if(close < open){
            generate(ans + ")" , open , close + 1 , max);
        }
    }
}
