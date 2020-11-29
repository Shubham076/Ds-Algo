import java.util.*;

public class test {
    public static void main(String[] args) {
        String A = "0000111111";
        int[][] B = {{3,4},{1,1},{1,6},{2,7},{3,9}};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        list.add(new ArrayList<Integer>(Arrays.asList(1,6)));
        list.add(new ArrayList<Integer>(Arrays.asList(2,7)));
        list.add(new ArrayList<Integer>(Arrays.asList(3,9)));


        // int[] arr = solve(A , B);
        // for(int i: arr){
        //     System.out.print(i);
        // }

        System.out.println(Solve(A , list));
    }

    public static int[] solve(String A, int[][] B) {
        
        int[] res = new int[B.length];
        if(A.length() == 0 || B.length == 0) return res;
        
        for(int i = 0; i < B.length; i++){
            int[] arr = B[i];
            String ss = A.substring(arr[0]-1 , arr[1]);
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < ss.length(); j++){
                if(ss.charAt(j) == '1'){
                  list.add(j);
                } 
                
            }
            int max = Collections.max(list);
            int min = Collections.min(list);
            int size = list.size() - 2;
            
            if(min == max) res[i] = 0;
            else{
                res[i] = max - min - size - 1;
            }
        }
        
        return res;
    }
    public static  ArrayList<Integer> Solve(String A, ArrayList<ArrayList<Integer>> B) {
        
        ArrayList<Integer> res = new ArrayList<>();
        if(A.length() == 0 || B.size() == 0) return res;
        
        for(int i = 0; i < B.size(); i++){
            ArrayList<Integer> arr = B.get(i);
            String ss = A.substring(arr.get(0)-1 , arr.get(1));
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < ss.length(); j++){
                if(ss.charAt(j) == '1'){
                  list.add(j);
                } 
                
            }

            int max = list.isEmpty() ? 0 :list.get(list.size() -1);
            int min = list.isEmpty() ? 0 :list.get(0);
            int size = list.size() - 2;
            
            if(min == max) res.add(0);
            else{
                res.add(max - min - size - 1);
            }
        }
        
        return res;
    }
    
}
