import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        print(s ,"");
        

    }

    public static void print(String s, String ans){

        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        if(s.length() == 1){
            int n = s.charAt(0) -'0';
            if(n == 0){
                return;
            }
            else{
                char c = (char)('a'+ n - 1);

                ans += c;
                System.out.println(ans);
                return;
            }
        }

          int n = s.charAt(0) -'0';
            if(n == 0){
                return;
            }
            else{
                char c = (char)('a'+ n - 1);
                print(s.substring(1) , ans + c);
            }

        int s12 = Integer.parseInt(s.substring(0,2));
        if(s12 <= 26){
        String ros = s.substring(2);
        char c = (char)('a' + s12 - 1);

        print(ros , ans + c);
        }


    }

}