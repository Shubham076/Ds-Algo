import java.util.HashMap;
import java.util.Stack;
public class balancedBackets {
    public static void main(String[] args){
        String s = "[[]]({}";
        HashMap<Character ,Character> m = new HashMap<>();
        Stack<Character> st = new Stack<>();
        m.put(')','(');
        m.put('}','{');
        m.put(']','[');

       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);

           if(m.containsKey(c)){
               char top = st.size() > 0 ? st.peek() : '#';
               if(top == m.get(c)){
                   st.pop();
               }
               else{
                   System.out.println("False");
                    return;
               }
           }
           else{
            // opening brackets
               st.push(c);
           }
       }
       System.out.println(st.size() == 0);
    }
}
