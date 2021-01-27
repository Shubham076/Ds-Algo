import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;
public class bfs extends FastReader{

    static class Edge{
        String nbr;
        public Edge(String nbr){
            this.nbr = nbr;
        }

        @Override
        public String toString(){
            return "(" + this.nbr +")";
        } 
    }

    static class pair{
        String psf;
        String v;
        
        public pair(String v , String psf){
            this.psf = psf;
            this.v = v;
        }
    }

    public static void addEdge(String s , String d  , HashMap<String , ArrayList<Edge>> map){
        ArrayList<Edge> l = new ArrayList<>();
        if(map.containsKey(s)){
            l = map.get(s);
        }

        l.add(new Edge(d));
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
        FastReader f = new FastReader();
        int e = f.nextInt();
        HashMap<String , ArrayList<Edge>> graph = new HashMap<>();

        for(int i = 0; i < e; i++){
            String s = f.next();
            String d = f.next();
            boolean isDir = f.nextBoolean();

            addEdge(s, d , graph);
            if(!isDir){
                addEdge(d , s  , graph);
            }

        }

        // printGraph(graph);
        BFS("A" , graph);
    }

    public static void BFS(String src , HashMap<String , ArrayList<Edge>> map){
        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair("A" , "" + "A"));
        HashSet<String> visited = new HashSet<>();

        while(q.size() > 0){
            pair rm = q.remove();
            if(visited.contains(rm.v)){
                continue;
            }

            visited.add(rm.v);

            System.out.println(rm.v + " @ " + rm.psf);
            for(Edge e : map.get(rm.v)){
                if(!visited.contains(e.nbr)){
                    q.add(new pair(e.nbr , rm.psf + e.nbr));
                }
            }
        }
    }

}