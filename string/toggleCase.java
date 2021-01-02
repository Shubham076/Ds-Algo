import java.util.*;
public class toggleCase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String ans = "";
        scn.close();
       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);

           if(c >= 'a' && c <= 'z'){
               char upperCase = (char)(c - 'a' + 'A');
               ans += upperCase;
           }
           else{
               char lowerCase = (char)(c - 'A' + 'a');
               ans += lowerCase;
           }
       }

       System.out.println(ans);
    } 
}
