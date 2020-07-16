package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import Heap.genericHeap;

public class graph {

	private class vtx { // vtx=vertex
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, vtx> vertices;

	public graph() {
		vertices = new HashMap<>();
	}

	public int numVertex() {
		return this.vertices.size();

	}

	public boolean containsVertex(String vName) {
		return this.vertices.containsKey(vName);
	}

	public void addVertex(String vName) {
		vtx vertex = new vtx();
		vertices.put(vName, vertex);

	}

	public void removeVertex(String vname) {

		vtx vertex = vertices.get(vname);
		ArrayList<String> keys = new ArrayList(vertex.nbrs.keySet());
		for (String key : keys) {
			vtx nbrvertex = vertices.get(key);
			nbrvertex.nbrs.remove(vname);
		}
		vertices.remove(vname);
	}

	public int numEdges() {
		int count = 0;
		ArrayList<String> keys = new ArrayList(vertices.keySet());
		for (String key : keys) {
			vtx vertex = vertices.get(key);
			count = count + vertex.nbrs.size();
		}
		return count / 2;

	}

	public boolean containsEdge(String vname1, String vname2) {
		vtx vertex1 = vertices.get(vname1);
		vtx vertex2 = vertices.get(vname2);
		if (vertex1 == null || vertex2 == null || !vertex1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {
		vtx vertex1 = vertices.get(vname1);
		vtx vertex2 = vertices.get(vname2);
		if (vertex1 == null || vertex2 == null || vertex1.nbrs.containsKey(vname2)) {
			return;
		}
		vertex1.nbrs.put(vname2, cost);
		vertex2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		vtx vertex1 = vertices.get(vname1);
		vtx vertex2 = vertices.get(vname2);
		if (vertex1 == null || vertex2 == null || !vertex1.nbrs.containsKey(vname2)) {
			return;
		}

		vertex1.nbrs.remove(vname2);
		vertex1.nbrs.remove(vname1);
	}

	public void display() {
		System.out.println("------------------");
		ArrayList<String> keys = new ArrayList<>(vertices.keySet());
		for (String key : keys) {
			vtx vertex = vertices.get(key);

			System.out.println(key + ":" + vertex.nbrs);
		}

		System.out.println("-----------------");
	}

	public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed) {
		processed.put(vname1, true);

		if (containsEdge(vname1, vname2)) {
			return true;
		}
		vtx vertex = vertices.get(vname1);
		ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
		for (String nbr : nbrs) {
			if (!processed.containsKey(nbr) && hasPath(nbr, vname2, processed)) {
				return true;
			}
		}
		return false;

	}

	private class pair {
		String name;
		String psf; /// path so far
	}

	public boolean bfs(String src, String dst) { /// dst=destination
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		// create a new pair
		pair p = new pair();
		p.name = src;
		p.psf = src;

		// add new pair in the queue
		queue.addLast(p);

		while (!queue.isEmpty()) {

//			remove a pair from the queue
			pair rp = queue.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
			if (processed.containsKey(rp.name)) {
				continue;
			}

//		put the pair in the hashmap processed
			processed.put(rp.name, true);

//		check if it contains direct edge to the destination
			if (containsEdge(rp.name, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

//		put the neighbours in the queue
			vtx vertex = vertices.get(rp.name);

			ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
			for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
				if (!processed.containsKey(nbr)) {
					pair np = new pair(); // new pair =np
					np.name = nbr;
					np.psf = rp.psf + nbr;

					queue.addLast(np);
				}
			}

		}
		return false;

	}

	public boolean dfs(String src, String dst) { /// dst=destination
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> stack = new LinkedList<>();

		// create a new pair
		pair p = new pair();
		p.name = src;
		p.psf = src;

		// add new pair in the queue
		stack.addFirst(p);

		while (!stack.isEmpty()) {

//			remove a pair from the queue
			pair rp = stack.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
			if (processed.containsKey(rp.name)) {
				continue;
			}

//		put the pair in the hashmap processed
			processed.put(rp.name, true);

//		check if it contains direct edge to the destination
			if (containsEdge(rp.name, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

//		put the neighbours in the queue
			vtx vertex = vertices.get(rp.name);

			ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
			for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
				if (!processed.containsKey(nbr)) {
					pair np = new pair(); // new pair =np
					np.name = nbr;
					np.psf = rp.psf + nbr;

					stack.addFirst(np);
				}
			}

		}
		return false;

	}

	public void bft() { /// dst=destination
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// create a new pair
			pair p = new pair();
			p.name = key;
			p.psf = key;

			// add new pair in the queue
			queue.addLast(p);

			while (!queue.isEmpty()) {

//			remove a pair from the queue
				pair rp = queue.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
				if (processed.containsKey(rp.name)) {
					continue;
				}

//		put the pair in the hashmap processed
				processed.put(rp.name, true);

				System.out.println(rp.name + " " + rp.psf);

//		put the neighbours in the queue
				vtx vertex = vertices.get(rp.name);

				ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
				for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
					if (!processed.containsKey(nbr)) {
						pair np = new pair(); // new pair =np
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}
		}

	}

	public boolean isCyclic() { /// dst=destination
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			// create a new pair
			pair p = new pair();
			p.name = key;
			p.psf = key;

			// add new pair in the queue
			queue.addLast(p);

			while (!queue.isEmpty()) {

//			remove a pair from the queue
				pair rp = queue.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
				if (processed.containsKey(rp.name)) {
					return true;
				}

//		put the pair in the hashmap processed
				processed.put(rp.name, true);

				System.out.println(rp.name + " " + rp.psf);

//		put the neighbours in the queue
				vtx vertex = vertices.get(rp.name);

				ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
				for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
					if (!processed.containsKey(nbr)) {
						pair np = new pair(); // new pair =np
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}
		}
		return false;

	}

	public boolean isConnected() { /// dst=destination
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());

		int flag = 0;

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

			flag++;

			// create a new pair
			pair p = new pair();
			p.name = key;
			p.psf = key;

			// add new pair in the queue
			queue.addLast(p);

			while (!queue.isEmpty()) {

//			remove a pair from the queue
				pair rp = queue.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
				if (processed.containsKey(rp.name)) {
					continue;
				}

//				add in the processed hashmap
				processed.put(rp.name, true);

//		put the neighbours in the queue
				vtx vertex = vertices.get(rp.name);

				ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
				for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
					if (!processed.containsKey(nbr)) {
						pair np = new pair(); // new pair =np
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}
		}
		if (flag >= 2)
			return false;
		else
			return true;

	}

	public boolean isTree() {
		return !isCyclic() && isConnected();
	}

	public ArrayList<ArrayList<String>> isCC() { /// dst=destination cc=connected components

		ArrayList<ArrayList<String>> ans = new ArrayList<>();

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		ArrayList<String> keys = new ArrayList<>(vertices.keySet());

		for (String key : keys) {

			if (processed.containsKey(key)) {
				continue;
			}

//			for new component created a new arrayList
			ArrayList<String> subAns = new ArrayList<>();

			// create a new pair
			pair p = new pair();
			p.name = key;
			p.psf = key;

			// add new pair in the queue
			queue.addLast(p);

			while (!queue.isEmpty()) {

//			remove a pair from the queue
				pair rp = queue.removeFirst(); // remove pair=rp

//		if the neighbour is already processed then move to nxt iteration
				if (processed.containsKey(rp.name)) {
					continue;
				}

//		put the pair in the hashmap processed
				processed.put(rp.name, true);

				subAns.add(rp.name);

//		put the neighbours in the queue
				vtx vertex = vertices.get(rp.name);

				ArrayList<String> nbrs = new ArrayList<>(vertex.nbrs.keySet());
				for (String nbr : nbrs) {

//			if neighbour is not present in hashmap then it is added in queue
					if (!processed.containsKey(nbr)) {
						pair np = new pair(); // new pair =np
						np.name = nbr;
						np.psf = rp.psf + nbr;

						queue.addLast(np);
					}
				}

			}
			ans.add(subAns);
		}
		return ans;

	}

	private class primsPair implements Comparable<primsPair> {
		String vname;
		String aqvname; /// aquired vertex name
		int cost;

		@Override
		public int compareTo(primsPair o) {
			return o.cost - this.cost; // min heap o=other
		}

	}

	public graph prims() {

		graph mst = new graph(); /// mst=minimum spanning tree

		HashMap<String, primsPair> map = new HashMap<>();

		genericHeap<primsPair> heap = new genericHeap<>();

		for (String key : vertices.keySet()) {
			primsPair np = new primsPair();
			np.vname = key;
			np.aqvname = null;
			np.cost = Integer.MAX_VALUE; // integer.max value is infinity;

			heap.add(np);
			map.put(key, np);
		}

		while (!heap.isEmpty()) {

			primsPair rp = heap.remove();
			map.remove(rp.vname);

			if (rp.aqvname == null) {
				mst.addVertex(rp.vname);
			} else {
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname, rp.aqvname, rp.cost);

			}

//		 update neighbours  suppose rp=A and neighbour=B  nc is edge b/w A and B
			for (String nbr : vertices.get(rp.vname).nbrs.keySet()) {

				if (map.containsKey(nbr)) { // if map contains it then it is also present in the heap
					int oc = map.get(nbr).cost;
					int nc = vertices.get(rp.vname).nbrs.get(nbr);
					// oc=old cost and nc =new cost

					if (nc < oc) {
						primsPair gp = new primsPair(); // gp=getpair
						gp = map.get(nbr);
						gp.aqvname = rp.vname;
						gp.cost = nc;
						heap.updatePriority(gp);
					}

				}
			}

		}

		return mst;

	}

	
	private class dkstraPair implements Comparable<dkstraPair> {
		String vname;
		String psf; /// aquired vertex name
		int cost;

		@Override
		public int compareTo(dkstraPair o) {
			return o.cost - this.cost; // min heap o=other
		}

	}

	public HashMap<String,Integer> dkstra(String source) {

		HashMap<String,Integer> ans=new HashMap<>();
		HashMap<String, dkstraPair> map = new HashMap<>();

		genericHeap<dkstraPair> heap = new genericHeap<>();

		for (String key : vertices.keySet()) {
			dkstraPair np = new dkstraPair();
			np.vname = key;
			np.psf = "";
			np.cost = Integer.MAX_VALUE;
			
			if(key.equals(source)) {
				np.psf=key;
				np.cost=0;
			}
		 // integer.max value is infinity;

			heap.add(np);
			map.put(key, np);
		}

		while (!heap.isEmpty()) {

			dkstraPair rp = heap.remove();
			map.remove(rp.vname);

			ans.put(rp.vname, rp.cost);

//		 update neighbours  suppose rp=A and neighbour=B  nc is edge b/w A and B
			for (String nbr : vertices.get(rp.vname).nbrs.keySet()) {

				if (map.containsKey(nbr)) { // if map contains it then it is also present in the heap
					int oc = map.get(nbr).cost;
					int nc = rp.cost+vertices.get(rp.vname).nbrs.get(nbr);
					// oc=old cost and nc =new cost

					if (nc < oc) {
						dkstraPair gp = new dkstraPair(); // gp=getpair
						gp = map.get(nbr);
						gp.psf = rp.psf+nbr;
						gp.cost = nc;
						heap.updatePriority(gp);
					}

				}
			}

		}

		return ans;

	}

}



