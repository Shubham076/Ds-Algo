import java.util.Stack;

// Add efficient
public class queueUsingStack {

    Stack<Integer> ms = new Stack<>();  //main stack
    Stack<Integer> hs = new Stack<>();  //helper stack
    
    void add(int data){
        ms.push(data);
    }

    int size(){
        return ms.size();
    }

    int peek(){
        if(this.size()== 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            while(ms.size() > 1){
                hs.push(ms.pop());
            }

            int val = ms.pop();
            hs.push(val);

            while(hs.size() > 0){
                ms.push(hs.pop());
            }

            return val;

        }

    }

    int remove(){
        if(this.size()== 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            while(ms.size() > 1){
                hs.push(ms.pop());
            }

            int val = ms.pop();

            while(hs.size() > 0){
                ms.push(hs.pop());
            }

            return val;

        }
    }

    void display(){
        System.out.println(ms);
    }
    
    public static void main(String[] args){

        queueUsingStack q = new queueUsingStack();
        for(int i = 1; i <= 5; i++){
            q.add(i);
        }

        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();

    }
}
