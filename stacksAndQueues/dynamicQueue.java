public class dynamicQueue extends queue {

    public dynamicQueue(){
        super(5);
    }

    void add(int data){
        if(this.size == this.data.length){
            int[] arr = new int[2 * this.data.length];
            for(int i = 0; i < this.size; i++){
                int idx = (front + i) % this.data.length;
                arr[i] = this.data[idx]; 
            }

            this.data = arr;
            this.front = 0;

        }
        super.add(data);
    }
    
    public static void main(String[] args){

    }
}
