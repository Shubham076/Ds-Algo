//leetcode 225 using only one queue
import java.util.*;
class stackUsingQueue3 {
    Queue<Integer> q;
    public stackUsingQueue3() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int s = q.size();
        while(s-- > 1){  //rotating the queue
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}
