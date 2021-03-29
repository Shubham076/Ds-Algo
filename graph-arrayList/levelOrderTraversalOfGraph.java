import java.io.*;
import java.util.*;
//spread of infection problem
public class levelOrderTraversalOfGraph {
	static class Edge {
		int src;
		int nbr;

		Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
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
			graph[v1].add(new Edge(v1, v2));
			graph[v2].add(new Edge(v2, v1));
		}

		int src = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());

		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[vtces];
		visited[src] = true;
		q.add(src);
		int level = 1;
		int count = 0;

		while (q.size() > 0 && level <= t) {
			int size = q.size();

			while (size-- > 0) {
				int r = q.remove();
				count++;
				for (Edge e : graph[r]) {
					if (!visited[e.nbr]) {
						q.add(e.nbr);
						visited[e.nbr] = true;
					}
				}
			}
			level++;
		}
		System.out.println(count);
	}
}