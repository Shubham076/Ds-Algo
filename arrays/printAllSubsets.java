public class printAllSubsets {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        int limit = (int)Math.pow(2,arr.length);

        for(int i = 0 ; i < limit; i++){
            int temp = i;
            String set = "";
            for(int j = arr.length - 1; j >= 0; j--){
                int r = temp % 2;
                temp /= 2;
                if(r == 0){
                    set = "_ "+set;
                }
                else 
                set = arr[j] +" "+ set;

            }
            System.out.println(set);
        }
    }
}
