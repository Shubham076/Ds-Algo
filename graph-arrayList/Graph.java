import java.util.ArrayList;

class Graph {

    static class edge {
        int src;
        int nbr;
        int cost;

        public edge(int src, int nbr, int cost) {
            this.src = src;
            this.nbr = nbr;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.src + "-" + this.nbr + ":" + this.cost;
        }
    }

    public void print(ArrayList<edge>[] g) {
        for (ArrayList<edge> i : g) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int vtcs = 7; //0 1 2 3 4 5 6
        ArrayList<edge>[] graph = new ArrayList[vtcs];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 3, 30));
        graph[0].add(new edge(0, 1, 10));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 2, 10));

        graph[2].add(new edge(2, 1, 10));
        graph[2].add(new edge(2, 3, 10));

        graph[3].add(new edge(3, 2, 10));
        graph[3].add(new edge(3, 0, 30));
        graph[3].add(new edge(3, 4, 10));

        graph[4].add(new edge(4, 3, 10));
        graph[4].add(new edge(4, 5, 10));
        graph[4].add(new edge(4, 6, 20));

        graph[5].add(new edge(5, 6, 10));
        graph[5].add(new edge(5, 4, 10));

        graph[6].add(new edge(6, 3, 10));
        graph[6].add(new edge(6, 4, 20));

        Graph g = new Graph();
        g.print(graph);



    }
}