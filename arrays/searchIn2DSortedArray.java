public class searchIn2DSortedArray {
    public static void main(String[] args){
        int[][] arr = {{11,12,13,14,15} , 
                        {21,22,23,24,25} ,
                        {31,32,33,34,35} , 
                        {41,42,43,44,45}};

        int i = 0;
        int j = arr[0].length - 1;
        int val = 320;
        while(i < arr.length && j >= 0){
            if(arr[i][j] == val){
                System.out.println("Found at " + i + " - "+ j);
                return;
            }
            else if(arr[i][j] < val){
                i++;
            }
            else{
                j--;
            }
        }

        System.out.println("Not Found");
    }
}
