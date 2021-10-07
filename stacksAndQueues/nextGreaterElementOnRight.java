import java.util.Stack;
public class nextGreaterElementOnRight {

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 7, 8};
        // int[] ans = method1(arr);
        int[] ans = method2(arr);


        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    // algo
    //  push the last element to the stack with nest greater value -1
    // now iterate from righ to left and pop all the elements from the stack having value less than arr[i]
    // ans for arr[i] = top of the stack;
    public static int[] method1(int[] arr) {

        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        s.push(arr[arr.length - 1]);

        // Total time complexity O(N)
        // O(N) outer loop
        for (int i = arr.length - 2; i >= 0; i--) {

            // inner loop runs in constant time
            while (s.size() > 0 && arr[i] >= s.peek()) {
                s.pop();
            }

            if (s.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }
        return ans;
    }

    public static int[] method2(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr.length];

        s.push(0);
        for (int i = 1; i < arr.length; i++) {

            while (s.size() > 0 && arr[i] > arr[s.peek()]) {
                int pos = s.peek();
                ans[pos] = arr[i];
                s.pop();
            }

            s.push(i);
        }
        while (s.size() > 0) {
            int pos = s.peek();
            ans[pos] = -1;
            s.pop();
        }
        return ans;
    }
}