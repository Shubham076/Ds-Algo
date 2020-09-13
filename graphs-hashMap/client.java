package graphs;

import java.util.HashMap;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		graph graph=new graph();
		
		
			graph.addVertex("A");
			graph.addVertex("B");
			graph.addVertex("C");
			graph.addVertex("D");
			graph.addVertex("E");
			graph.addVertex("F");
			
			graph.addEdge("A", "B", 2);
     		graph.addEdge("A", "C", 2);
			graph.addEdge("B", "D", 2);
			graph.addEdge("B", "E", 2);
			graph.addEdge("C", "D", 3);
			graph.addEdge("E", "F", 5);
			
//			graph.display();
//			
//			System.out.println(graph.containsEdge("B","C"));
//			
//			
//			System.out.println(graph.numEdges());
//			
////			
//			System.out.println(	graph.numVertex());
//			System.out.println("--------------");
//			System.out.println(graph.hasPath("A", "F", new HashMap<>()));
			
//			System.out.println("---------");
//			System.out.println(graph.dfs("A", "F"));
//			
//			System.out.println();
//			graph.bft();
//			
//			System.out.println();
//			System.out.println(graph.isCyclic());
//		
//		System.out.println("----------------");
//		System.out.println(graph.isConnected());
//		
//		System.out.println("=======");
//		System.out.println(graph.isTree());		
//		
//		System.out.println("..................");
//		
//		
//		System.out.println(graph.isCC());
			
			
			
			graph.prims().display();
			
			
			System.out.println("----------------");
			
			
		System.out.println(graph.dkstra("A"));
		
	}
	
		
	

}
