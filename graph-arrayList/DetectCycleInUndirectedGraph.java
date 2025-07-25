import java.util.*;
class DetectCycleInUndirectedGraph {
	static class Pair{
		int first;
		int second;
		public Pair(int first, int second){
			this.first = first;
			this.second = second;
		}
	}

	public static int findSet(int i, int[] parent){
		if(parent[i] == -1){
			return i;
		}

		//path compression optimization
		parent[i] = findSet(parent[i], parent);
		return parent[i];
	}

	public static void unionSet(int x, int y, int[] parent, int[] rank){
		int s1 = findSet(x, parent);
		int s2 = findSet(y, parent);

		if(s1 != s2){
			if(rank[s1] < rank[s2]){
				parent[s1] = s2;
				rank[s2] += rank[s1];
			}
			else{
				parent[s2] = s1;
				rank[s1] += rank[s2];
			}
		}
	}

	public static boolean containsCycle(Pair[] edgeList, int v ){
		int[] parent = new int[v];
		int[] rank = new int[v];
		for(int i = 0; i < v; i++){
			parent[i] = -1;
			rank[i] = 1;
		}

		for(Pair p : edgeList){
			int i = p.first;
			int j = p.second;

			int s1 = findSet(i, parent);
			int s2 = findSet(j, parent);

			if(s1 == s2){
				System.out.println("Same parents " + s1 + " " + s2);
				return true;
			}
			else{
				unionSet(i, j, parent, rank);
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt();
		int e = scn.nextInt();
		Pair[] edgeList = new Pair[e];
		for(int i = 0; i < e; i++){
			int f = scn.nextInt();
			int s = scn.nextInt();
			edgeList[i] = new Pair(f, s);
		}

		containsCycle(edgeList, v);	
	}
}