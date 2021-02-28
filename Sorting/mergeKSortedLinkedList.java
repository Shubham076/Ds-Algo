import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
class mergeKSortedLinkedList{
	static class Node implements Comparable<Node>{
		int data;
		int li;
		int di;
		public Node(int data , int li, int di){
			this.data = data;
			this.li = li;
			this.di = di;
		}

		@Override
		public String toString(){
			return this.data + " ";
		}

		@Override
		public int compareTo(Node other){
			return this.data - other.data;
		} 
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<LinkedList<Integer>> arr = new ArrayList<>();

		for(int i = 0; i < n; i++){
			int s = scn.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			for(int j = 0; j < s; j++){
				list.add(scn.nextInt());
			}
			arr.add(list);
		}
		
		System.out.println(arr);

		ArrayList<Integer> ans = merge(arr);
		System.out.println();
		System.out.println(ans);
	}

	public static ArrayList<Integer> merge(ArrayList<LinkedList<Integer>> arr){
		PriorityQueue<Node> q = new PriorityQueue<>();
		ArrayList<Integer> l = new ArrayList<>();

		for(int i = 0; i < arr.size(); i++){
			int data = arr.get(i).get(0);
			int li = i;
			int di = 0;
			Node n = new Node(data , li , di);
			q.add(n);
		}

		while(q.size() > 0){
			Node rm = q.remove();
			l.add(rm.data);
			rm.di++;

			if(rm.di < arr.get(rm.li).size()){
				rm.data = arr.get(rm.li).get(rm.di);
				q.add(rm);
			}
		}

		return l;
	}
}