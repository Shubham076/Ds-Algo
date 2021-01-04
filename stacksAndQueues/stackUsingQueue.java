import java.util.Queue;
import java.util.ArrayDeque;

// push effficent
public class stackUsingQueue {

    Queue<Integer> mq = new ArrayDeque<>();  //main queue
    Queue<Integer> hq = new ArrayDeque<>();  //helper queue


    void push(int data){
        mq.add(data);
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
            while(mq.size() > 1){
                hq.add(mq.remove());
            }

                int top = mq.remove();
                hq.add(top);

                while(hq.size() > 0){
                    mq.add(hq.remove());
                }
                return top;
        }
    }

    int pop(){
        if(this.size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            while(mq.size() > 1){
                hq.add(mq.remove());
            }

                int top = mq.remove();
                while(hq.size() > 0){
                    mq.add(hq.remove());
                }
                return top;
        }
    }

    void display(){
        System.out.println(mq);
    }


    public static void main(String[] args){
        stackUsingQueue s = new stackUsingQueue();

        for(int i = 1; i <= 5; i++){
            s.push(i);
        }

        s.display();
        System.out.println(s.peek());
        s.pop();
        s.display();



    }
}
