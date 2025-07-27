/*
A Bipartite Graph is a graph whose vertices can be divided into two independent sets,
U and V such that every edge (u, v) either connects a vertex from U to V or a vertex from V to U
if cycle is not present means graph is bi-partite
else if even length cycle is present means graph is bipartite
odd length cycle => graph is not bipartite
we can find using bfs
*/

import java.io.*;
import java.util.*;

public class IsBipartite {
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

    static class Pair {
        int v;
        String psf;
        int level;

        public Pair(int v, String psf, int level) {
            this.v = v;
            this.psf = psf;
            this.level = level;
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
        int[] visited = new int[vtces];
        Arrays.fill(visited, -1);

        for (int i = 0; i < vtces; i++) {
            if (visited[i] == -1) {
                boolean isBipartite = checkBipartite(graph, visited, i);
                if (!isBipartite) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }

    public static boolean checkBipartite(ArrayList<Edge>[] graph, int[] visited, int src) {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.addLast(new Pair(src, src + "", 0));

        while (!q.isEmpty()) {
            Pair rp = q.removeFirst();

            //means it is visited
            if (visited[rp.v] != -1) {
                if (rp.level != visited[rp.v]) {
                    return false;
                }
            }

            visited[rp.v] = rp.level;
            for (Edge e : graph[rp.v]) {
                if (visited[e.nbr] == -1) {
                    q.addLast(new Pair(e.nbr, rp.psf + e.nbr, rp.level + 1));
                }
            }
        }
        return true;
    }
}