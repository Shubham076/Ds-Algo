import java.util.*;
public class queue {
    // FIFO first in first out (Add last remove first)
    // functions
    // add  generally enq
    // remove generally deq
    // peek  data from the front

    int[] data;
    int front;
    int size;

    public queue(int cap){
        data = new int[cap];
        front = 0;
        size = 0;
    }

    int size(){
        return this.size;
    }

    void add(int data){
        if(this.size() == this.data.length){
            System.out.println("Queue overflow");
        }
        else{
            int rear = (this.front + this.size) % this.data.length;
            this.data[rear] = data; 
            this.size++;
        }
    }

    int remove(){
        if(this.size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            int val = this.data[this.front];
            this.front = (this.front + 1) % this.data.length;
            this.size--;
            return val;
        }
    }

    int peek(){
        if(this.size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else{
            return this.data[this.front];
        }
    }

    void display(){
        for(int i = 0; i < this.size; i++){
            int idx = (front + i) % data.length;
            System.out.print(this.data[idx] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        // using build in queue provided bt java
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);

    }
}
