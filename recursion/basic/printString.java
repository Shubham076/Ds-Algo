//given an input string you have to write a recursive fn which print the substring within the parenthesis
//input xyz()))))))))))))))cfghj(pepcoding)def
// output = ()(pepcoding)

import java.util.*;
public class printString{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            String s = scn.next();
            print_String(s, "", false);
        }
    }

    //op is denoting open braakcet found
    public static void print_String(String s, String ans , boolean op){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        char c = s.charAt(0);
        if(c == '('){
            print_String(s.substring(1) , ans + c , true);
        }
        else if(c == ')' && op){
            print_String(s.substring(1) , ans + c , false);
        }
        else if(op){
            print_String(s.substring(1) , ans + c , true);
        }
        else{
            print_String(s.substring(1) , ans , false);            
        }
    }
}
