import java.util.Stack;
public class duplicatesBrackets {
    public static void main(String[] args){
        String s2 = "(a + b) + ((c + d))";
        int cnt = 0;
        boolean duplicate = false;
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);

            if(c == ')'){
                if(s.peek() == '('){
                    duplicate = true;
                    cnt++;
                    s.pop();
                }
                else{
                    while(s.peek() != '('){
                        s.pop();
                    }
                    s.pop();
                }
            }
            else{
                s.push(c);
            }

        }
        System.out.println("Duplicate Brackets present? " + duplicate);
        System.out.println("Count of duplicate Brackets: " + cnt);
    }
}
