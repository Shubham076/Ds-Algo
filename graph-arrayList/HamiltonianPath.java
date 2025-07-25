//hamiltonian path path in which we visites each vertex atleast once
//hamiltonian cycle path in which we reach the same node where we started after visiting each vertex once
import java.io.*;
import java.util.*;

public class HamiltonianPath {
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

        int src = Integer.parseInt(br.readLine());

        // write all your codes here
        HashSet<Integer> visisted = new HashSet<>();
        printAllPath(graph, src, visisted, "" + src, src);
    }

    public static void printAllPath(ArrayList<Edge>[] graph, int src, HashSet<Integer> visited, String psf, int os) {

        if (visited.size() == graph.length - 1) {
            System.out.print(psf);

            boolean cycle = false;
            for (Edge e : graph[src]) {
                if (e.nbr == os) {
                    cycle = true;
                    break;
                }
            }

            if (cycle) {
                System.out.println("*");
            } else {
                System.out.println(".");
            }
        }

        visited.add(src);
        for (Edge e : graph[src]) {
            if (!visited.contains(e.nbr)) {
                printAllPath(graph, e.nbr, visited, psf + e.nbr, os);
            }
        }
        visited.remove(src);
    }

}