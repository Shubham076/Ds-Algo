import java.util.Queue;
import java.util.ArrayDeque;

// pop efficient
public class stackUsingQueue2 {

    Queue<Integer> mq = new ArrayDeque<>();  //main queue
    Queue<Integer> hq = new ArrayDeque<>();  //helper queue

    void push(int data){
        while(mq.size() > 0){
            hq.add(mq.remove());
        }

        mq.add(data);

        while(hq.size() > 0){
            mq.add(hq.remove());
        }
    }

    int size(){
        return mq.size();
    }

    int peek(){

        if(this.size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return mq.peek();
        }
    }

    int pop(){
        if(this.size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{

            return mq.remove();
       
        }
    }

    void display(){
        System.out.println(mq);
    }


    public static void main(String[] args){
        stackUsingQueue2 s = new stackUsingQueue2();

        for(int i = 1; i <= 5; i++){
            s.push(i);
        }

        s.display();
        System.out.println(s.peek());
        s.pop();
        s.display();



    }
}
