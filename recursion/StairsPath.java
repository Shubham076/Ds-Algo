import java.util.ArrayList;

public class StairsPath {

    public static void main(String[] args) {
        
        // we can take one step , 2 step ,3step

        System.out.println(getPath(7));
    }

    public static ArrayList<String> getPath(int n){

        if( n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(n < 0){
            ArrayList<String> nbase = new ArrayList<>();
            return nbase;
        }


        ArrayList<String> path1 = getPath(n-1);

        ArrayList<String> path2 = getPath(n-2);

        ArrayList<String> path3 = getPath(n-3);
        // all the paths from n-3 to the 0;

        ArrayList<String> myres = new ArrayList<>();

        for(String s: path1){
            myres.add(1 + s);

        }

        for(String s: path2){
            myres.add(2 + s);

        }

        for(String s: path3){
            myres.add(3 + s);

        }

        return myres;

        
    }
    
}