import java.util.*;
import java.util.HashMap;

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
	public int max(int[] nums) throws Exception {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for (int n: nums) {
			if (!map.containsKey(n)) {
				int left = map.getOrDefault(n - 1, 0);
				int right = map.getOrDefault(n + 1, 0);
				int length = left + right + 1;
				max = Math.max(max, length);
				map.put(n, length);

				// expand the boundaries
				map.put(n - left, length);
				map.put(n + right, length);
			}
		}
		return max;
	}
}