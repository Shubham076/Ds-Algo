import java.util.*;
public class AllPalindromicSubstring{
    public static boolean isPalindrome(String s){
        int start = 0;
        int end  = s.length() - 1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        
        return true;
    }

	public static void solution(String s){
		for(int i = 0; i < s.length(); i++){
		    for(int j = i + 1; j  <= s.length(); j++){
		        if(isPalindrome(s.substring(i , j))){
		            System.out.println(s.substring(i , j));
		        }
		    }
		}
		
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        solution(str);
        scn.close();
	}
}
