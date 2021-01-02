import java.util.*;
public class stringCompression {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        StringCompression1(s);
        StringCompression2(s);
        scn.close();
    } 

    public static void StringCompression1(String s){
        int i = 1;
        String str = "" + s.charAt(0); 
        while(i < s.length()){
            if(s.charAt(i) != s.charAt(i - 1)){
                str += s.charAt(i);
            }
            i++;
        }

        System.out.println(str);

    }

    public static void StringCompression2(String s){
        int i = 1;
        int count = 1;
        String str = "" + s.charAt(0); 
        while(i < s.length()){
            if(s.charAt(i) != s.charAt(i - 1)){
                str += count != 1 ? count : "";
                str += s.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
            i++;
        }

        if(count != 1){
            str += count;
        }

        System.out.println(str);

    }
}
