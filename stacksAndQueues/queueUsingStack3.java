//leetcode 232  push 0(1) pop o(1) amortized
import java.util.*;
class MyQueue {
    Stack<Integer> s;
    Stack<Integer> hs;
    int front;
    public MyQueue() {
        s = new Stack<>();
        hs = new Stack<>();
        front = -1;
    }
    
    //O(1)
    public void push(int x) {
        if(s.size() == 0) front = x;
        s.push(x);    
    }

    //O(1) amortized
    public int pop() {
        if(hs.size() == 0){
            if(s.size() == 0) return -1;
            else{
                while(s.size() != 0){
                    hs.push(s.pop());
                }
            }
        }
        return hs.pop();
    }
    //O(1)
    public int peek() {
        if(!hs.empty()) return hs.peek();
        return front;
    }
    
    public boolean empty() {
        return hs.size() == 0 && s.size() == 0;
    }
}
