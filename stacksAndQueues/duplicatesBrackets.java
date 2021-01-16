import java.util.Stack;
public class duplicatesBrackets {
    public static void main(String[] args){
        String s1 = "(a+b)+((c+d))";
        String s2 = "((a+b)+(c+d))";

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);

            if(c == ')'){
                if(s.peek() == '('){
                    System.out.println(true);
                    return;
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

        System.out.println(false);

    }
}
