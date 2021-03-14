//You are given an integer n. In one move, you can either multiply n by two or divide n by 6 (if it is divisible by 6
// without the remainder).
// Your task is to find the minimum number of moves needed to obtain 1
// from n or determine if it's impossible to do that.

import java.util.Scanner;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;
public class convertNTo1{
     
        static class Pair{
            int val;
            int steps;
     
            public Pair(int val , int steps){
                this.val = val;
                this.steps = steps;
            }
        }
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            scn.nextLine();
            while(t-- > 0){
                int n = scn.nextInt();
                int steps = minOperations(n , 1);
                System.out.println(steps);
     
            }
     
        }
     
        public static int minOperations(int src , int target){
            HashSet<Integer> set = new HashSet<>();
            Queue<Pair> q = new ArrayDeque<>();
            Pair s = new Pair(src , 0);
            q.add(s);
     
            while(q.size() > 0){
                Pair rp = q.remove();
     
                if(set.contains(rp.val)){
                    continue;
                }
     
                set.add(rp.val);
                if(rp.val == target){
                    return rp.steps;
                }
     
                int rem = rp.val % 6;
                if(rem == 0){
                    Pair p2 = new Pair(rp.val / 6 , rp.steps + 1);
                    q.add(p2);
                }
                Pair p1 = new Pair(rp.val * 2 , rp.steps + 1);
                q.add(p1);
     
            }
     
            return -1;
            
        }
    }