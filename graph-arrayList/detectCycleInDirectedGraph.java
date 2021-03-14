import java.util.*;
class detectCycleInDirectedGraph{
	static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }

        @Override
        public String toString(){
        	return "[" + this.src + "-" + this.nbr +  "] ";
        }
    }

    public static void printGraph(ArrayList<Edge>[] g){
    	for(ArrayList<Edge> l : g){
    		for(Edge e : l){
    			System.out.print(e);
    		}
    		System.out.println();
    	}
    }

    public static boolean detectCycle(int src, ArrayList<Edge>[] g, boolean[] visited, boolean[] stack){

    	visited[src] = true;
    	stack[src] = true;
    	for(Edge e : g[src]){

    		//case when it contains a back edge(means we are visiting the nbr again)
    		if(stack[e.nbr]){
    			return true;
    		}
    		else if(!visited[e.nbr]){
    			boolean isCyclePresent = detectCycle(e.nbr, g, visited, stack);
    			if(isCyclePresent){
    				return true;
    			}
    		}
    	}

    	stack[src] = false;
    	return false;
    }

// make sure all the edges are directed in the input
    public static void main(String[] args){
    	fastReader f = new fastReader();
    	int vtces = f.nextInt();
    	ArrayList<Edge>[] graph = new ArrayList[vtces];
    	for(int i = 0; i < vtces; i++){
    		graph[i] = new ArrayList<Edge>();
    	}
    	int edges = f.nextInt();
    	for(int i = 0; i < edges; i++){
    		int src = f.nextInt();
    		int des = f.nextInt();
    		graph[src].add(new Edge(src, des));
    	}

    	printGraph(graph);
    	boolean[] visited = new boolean[vtces];

    	//stack contains the current path we are following
    	boolean[] stack = new boolean[vtces];
    	System.out.println();
    	System.out.println(detectCycle(0, graph, visited, stack));
    }
}