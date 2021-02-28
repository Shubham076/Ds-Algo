import java.util.Scanner;
class removerepeatingPermutations{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        boolean[] arr = new boolean[0];
        printPermutations(s , "" , arr);
    }

    public static void printPermutations(String s , String ans , boolean[] visited){
        if(s.length() == 0){
            System.out.println(ans);
        }

        visited = new boolean[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(visited[(int)(c - 'a')] == false){
                visited[(int)(c - 'a')] = true;
                String ros = s.substring(0 , i)  + s.substring(i + 1);
                printPermutations(ros,  ans + c, visited);
            }
        }
    }
}