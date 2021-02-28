import java.util.*;
class longestValidParenthesis{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the sequence: ");
		String s = scn.next();
		scn.close();
        int left = 0;
        int right = 0;
        int max = 0;

        // left 2 Right Scan
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                left++;
            }
            else{
                right++;
            }

            if(left == right){
                max = (int) Math.max(max , 2*right);
            }
            else if (right > left){
                left = right = 0;
            }
        }
        left = right = 0;
        // right 2 left scan
        for(int i = s.length() -1 ; i>=0; i--){
            if(s.charAt(i) == '('){
                left++;
            }
            else{
                right++;
            }

            if(left == right){
                max = (int) Math.max(max , 2*left);
            }
        	else if(left > right){
            	left = right = 0;
            	}
        	}
        System.out.println(max);
    } 
}