import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class MergeKSortedList {

    static class Pair implements Comparable<Pair> {
        int li;     // list index
        int di;     // data index
        int v;

        public Pair(int li, int di , int v){
            this.li = li;
            this.di = di;
            this.v = v;
        }

        public int compareTo(Pair o){
            return this.v - o.v;

        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i = 1; i <= k; i++){
            int l = scn.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(); 
            for(int j = 0; j < l; j++){
                arr.add(scn.nextInt());
            }
            lists.add(arr);
        }
        scn.close();

        System.out.println(merge(lists));
    }

    public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> ans  = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < lists.size(); i++){
            Pair p = new Pair(i , 0 , lists.get(i).get(0));
            pq.add(p);
        }

            while(pq.size() > 0){
                Pair rp = pq.remove();
                ans.add(rp.v);
                rp.di++;

                if(rp.di < lists.get(rp.li).size()){
                    rp.v = lists.get(rp.li).get(rp.di);
                    pq.add(rp);
                }
            }
        




        return ans;
    }
}