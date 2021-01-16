import java.io.*;
import java.util.*;

public class Main {

    static String[] arr = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(getKPC(s));


    }

    public static ArrayList<String> getKPC(String s) {
        if(s.length() == 0){
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        
        String S = arr[s.charAt(0) - '0'];
        
        ArrayList<String> rr = getKPC(s.substring(1));
        ArrayList<String> mr = new ArrayList<>();
        
        for(int i = 0; i < S.length(); i++){
            for(String str : rr){
                mr.add(S.charAt(i) + str);
            }
        }
        
        return mr;
        
        
    
        
    }

    public static void printKPC(String s , String ans) {
        
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        
        String S = arr[s.charAt(0) - '0'];
        for(int i = 0; i < S.length(); i++){
            printKPC(s.substring(1) , ans + S.charAt(i));
        }


    }

}