public class longestInvalidParenthesis {
    public static void main(String[] args){
        String s = "(())";
        if(!isValid(s)){
            System.out.println(s.length());
        }
        else{
            System.out.println(s.length() - 1);
        }
    }

    public static boolean isValid(String s){
        int count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else{
                count--;
            }
            if(count < 0){
                System.out.println("false");
                return false;
            }
        }
        return count == 0;
    }
}
