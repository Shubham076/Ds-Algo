import java.io.*;
import java.util.*;

class MinStack2 {
    Stack<Integer> data;
    int min;

    public MinStack2() {
        data = new Stack<>();
    }

    int size() {
        // write your code here
        return data.size();
    }

    void push(int val) {
        // write your code here
        if (data.size() == 0) {
            data.push(val);
            min = val;
        } else if (data.size() != 0 && val < min) {
            data.push(val + val - min);
            min = val;
        } else {
            data.push(val);
        }
    }

    int pop() {
        // write your code here
        int val = data.pop();
        if (val < min) {
            // minp = previous min
            int minp = 2 * min - val;
            int temp = min;
            min = minp;
            return temp;

        } else {
            return val;
        }
    }

    int top() {
        // write your code here
        int val = data.peek();
        if (val < min) {
            return min;
        } else {
            return val;
        }
    }

    int min() {
        return min;
        // write your code here
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack2 st = new MinStack2();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.min();
                if (val != -1) {
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}