class Solution {
    
    static class Pair{
        int v;
        int count;
        public Pair(int v , int count){
            this.v = v;
            this.count = count;
        }
    }
    public int snakesAndLadders(int[][] board) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean left = true;
        for(int i = board.length - 1; i >= 0; i--){
            
            if(!left){
                for(int j = board[0].length - 1; j >= 0; j--){
                    arr.add(board[i][j]);
                }
            }
            else{
                for(int j = 0; j < board[0].length; j++){
                 arr.add(board[i][j]);
              }
            }
            
            left = !left;

        }
    
        boolean[] visited = new boolean[arr.size()];
        return bfs(0 , arr.size() - 1 , visited , arr);
        

}
    
    public static int bfs(int src , int des ,boolean[] visited , ArrayList<Integer> arr){
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0 , 0));
        
        while(q.size() > 0){
            Pair rm = q.remove();

            if(visited[rm.v]){
                continue;
            }
            
            visited[rm.v] = true;
            
            if(rm.v == des){
                return rm.count;
                
            }
            
            for(int i = 1; i <= 6; i++){
                int ni = rm.v + i;
                if(ni >= arr.size()){
                    break;
                }
                
                if(arr.get(ni) != -1){
                    ni = arr.get(ni) - 1;
                }
                    
                q.add(new Pair(ni , rm.count + 1));
            }
            
         
        }
        
        return -1;
    }
}