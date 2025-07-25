import java.util.*;
// leetcode 128
class longestConsecutiveSequence{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
			set.add(arr[i]);
		}
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			int num = arr[i];
			int streak = 1;
			while(set.contains(num + streak)){
				streak += 1;
			}

			if(streak > max){
				max = streak;
			} 
		}
		System.out.println(max);
	}

	// with single iteration
	public int max(int[] arr) throws Exception {
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			int n = arr[i];

			if(!map.containsKey(n)){
				int sp = n;
				int ep = n;
				if(map.containsKey(n - 1)){
					sp = sp - map.get(n - 1);
				}
				if(map.containsKey(n + 1)){
					ep = ep + map.get(n + 1);
				}

				if(sp != n && ep != n){
					map.put(n, 1);
				}

				int len = ep - sp + 1;
				map.put(sp, len);
				map.put(ep , len);
				max = Math.max(len, max);
			}
		}
		return max;
	}
}