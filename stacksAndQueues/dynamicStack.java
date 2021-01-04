public class dynamicStack extends stack {

    public dynamicStack(){
        super(5);   //calls the constructor of the parent class
    }

    void push(int data){
        if(this.top == this.data.length - 1){
            int[] arr = new int[2 * this.data.length];
            for(int i = 0 ; i < this.data.length; i++){
                arr[i] = this.data[i];
            }

            this.data = arr;
        }

        // calls the method of the parent class
        super.push(data);
    }

    public static void main(String[] args){
        dynamicStack s = new dynamicStack();
        for(int i = 1; i <= 10; i++){
            s.push(i);
        }

        System.out.println("Top of stack " + s.peek());
        s.display();
        System.out.println(s.size());

        for(int i = 9; i >= 0; i--){
            s.pop();
        }

        System.out.println(s.isEmpty());
    }
}
