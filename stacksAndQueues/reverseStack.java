import java.util.Stack;

// time complexity  O(N2) and space complexity O(N)
class reverseStack{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i <= 5; i++){
            s.push(i);
        }
        System.out.println(s.peek());
        reverse(s);
        System.out.println(s.peek());
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverse(s);
        addAtLast(s, temp);
    }

    public static void addAtLast(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addAtLast(s , data);
        s.push(top);
    }
}