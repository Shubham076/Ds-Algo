//Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

//The distance between two adjacent cells is 1

//Input:
//[[0,0,0],
// [0,1,0],
// [1,1,1]]

//Output:
//[[0,0,0],
// [0,1,0],
// [1,2,1]]

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;
public class 01matrix{

    static class fastReader{
        BufferedReader br;
        StringTokenizer st;

        public fastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        } 

        String Next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(Next());
        }

        float nextFloat(){
            return Float.parseFloat(Next());
        }

        double nextDouble(){
            return Double.parseDouble(Next());
        }

        long nextLong(){
            return Long.parseLong(Next());
        }

        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }

        String next(){
            return Next();
        }
    }

    static class Pair{
        int i; 
        int j;
        public Pair(int i , int  j){
            this.i = i; 
            this.j = j;
        }
    }   
    static int[][] dir = {{0, 1} , {1, 0} , {0 , -1} , {-1 , 0}};

    public static void main(String[] args){
        long start = System.nanoTime();
        fastReader f = new fastReader();
        int n = f.nextInt();
        int m = f.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = f.nextInt();
            }
        }
        int[][] ans = new int[n][m];
        Queue<Pair> q = new ArrayDeque<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 0){
                    ans[i][j] = 0;
                    q.add(new Pair(i , j));
                }
                else{
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while(q.size() > 0){
            Pair p = q.remove();
            int x = p.i;
            int y = p.j;

            for(int[] d : dir){
                int adjx = x + d[0];
                int adjy = y + d[1];

                if(adjx < 0 || adjy < 0 || adjy >= arr[0].length || adjx >= arr.length || 1 + ans[x][y] > ans[adjx][adjy]){
                    continue;
                }

                ans[adjx][adjy] = 1 + ans[x][y];
                q.add(new Pair(adjx , adjy));
            }
        }

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        long end = System.nanoTime();
        System.out.println((end - start) / 1000000000 + "s");

    }

}

