import java.io.*;
import java.util.*;


// celebrity is who that know no one and everyone knows him 
public class celebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            s.push(i);
        }
        
        while(s.size() >= 2){
            int i = s.pop();
            int j = s.pop();
            
            if(arr[i][j] == 1){
                // means i knows j =>  i is not celebrity
                s.push(j);
            }
            else{
                // means i dont know j => means j is not the celebrity
                s.push(i);
            }
        }
        

        //pot = potential
        int pot = s.pop();
        
        for(int i = 0; i < arr.length; i++){
            if(i != pot){
                if(arr[pot][i] == 1 || arr[i][pot] == 0){
                    System.out.println("none");
                    return;
                }
            }
            
        }
        System.out.println(pot);
    }

}