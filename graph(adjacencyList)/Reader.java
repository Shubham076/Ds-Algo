import java.util.ArrayList;
import java.util.HashMap;
class Reader extends fastReader {

    
    static class Edge{
        String nbr;
        int w;
        public Edge(String nbr , int w){
            this.nbr = nbr;
            this.w = w;
        }

        @Override
        public String toString(){
            return "(" + this.nbr + "," + this.w + ")";
        } 
    }

    public static void addEdge(String s , String d , int weight , HashMap<String , ArrayList<Edge>> map){
        ArrayList<Edge> l = new ArrayList<>();
        if(map.containsKey(s)){
            l = map.get(s);
        }

        l.add(new Edge(d , weight));
        map.put(s , l);
    }

    public static void printGraph(HashMap<String , ArrayList<Edge>> map){
        for(String s : map.keySet()){
            System.out.print(s + "-");
            for(Edge e : map.get(s)){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        // long start = System.nanoTime();
        fastReader f = new fastReader();
        int e = f.nextInt();
        HashMap<String , ArrayList<Edge>> graph = new HashMap<>();

        for(int i = 0; i < e; i++){
            String s = f.next();
            String d = f.next();
            int w = f.nextInt();
            boolean isDir = f.nextBoolean();

            addEdge(s, d , w , graph);
            if(!isDir){
                addEdge(d , s , w , graph);
            }

        }

        printGraph(graph);
        // long end = System.nanoTime();
        // System.out.println((end - start) / 1000000000 + "s");
    }

}