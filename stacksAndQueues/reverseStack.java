import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

// time complexity  O(N2) and space complexity O(N)
class reverseStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= 5; i++){
            st.push(i);
        }
        System.out.println(st);
        // move all the elements from stack to auxilary stack
        while (st.size() > 0) {
            queue.add(st.pop());
        }

        // move back
        while (queue.size() > 0) {
            st.push(queue.remove());
        }
        System.out.println(st);
    }
}