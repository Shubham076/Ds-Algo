import java.io.*;
import java.util.*;

public class MinimumWireRequired {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int aqv;
        int wt;

        public Pair(int v, int aqv, int wt) {
            this.v = v;
            this.aqv = aqv;
            this.wt = wt;
        }

        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean[] visited = new boolean[vtces];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0, -1, 0));

        while (!q.isEmpty()) {
            Pair rp = q.remove();
            if (visited[rp.v]) {
                continue;
            }

            visited[rp.v] = true;
            if (rp.v != 0) {
                System.out.println("[" + rp.v + "-" + rp.aqv + "@" + rp.wt + "]");
            }

            for (Edge e : graph[rp.v]) {
                if (!visited[e.nbr]) {
                    q.add(new Pair(e.nbr, rp.v, e.wt));
                }
            }
        }
    }
}