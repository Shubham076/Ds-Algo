public class getMazePathWithJumps {

    // here we can take the max H jump of difference betwenn start and the end colmn
    // H1 = one step H2 = twosteps and so on
    // similarly for v and  D also

    public static void main(String[] args) {
        
        getPath(1,1,3,3,"");
    }
    
    public static void getPath(int sr , int sc , int er, int ec , String ans){
        
        if(sr == er && sc == ec){
            System.out.println(ans);
            return;
        }


        // Horizontal movement
        for(int i = 1; i <= ec - sc; i++){

            getPath(sr, sc + i, er, ec, ans + "H" + i+" ");

        }

// vertical movemnent
        for(int i = 1 ; i <= er - sr ; i++ ){
            getPath(sr + i, sc, er, ec, ans+ "V" + i+" " );
        }

        // digonal movement

        for(int i = 1 ; i <= ec - sc && i <= er - sr ; i++ ){
            getPath(sr + i, sc + i, er, ec, ans + "D" + i+" ");
        }
    }
}