import java.util.Stack;

// remove efficient
public class queueUsingStack2 {

    Stack<Integer> ms = new Stack<>();  //main stack
    Stack<Integer> hs = new Stack<>();  //helper stack

    void add(int data){
        while(ms.size() > 0){
            hs.add(ms.pop());
        }

        ms.push(data);

        while(hs.size() > 0){
            ms.push(hs.pop());
        }
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
          return ms.peek();

        }
    }

    int remove(){
        if(this.size()== 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
          return ms.pop();
        }
    }

    void display(){
        System.out.println(ms);
    }
    
    public static void main(String[] args){
        queueUsingStack2 q = new queueUsingStack2();
        for(int i = 1; i <= 5; i++){
            q.add(i);
        }
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();

    }
}
