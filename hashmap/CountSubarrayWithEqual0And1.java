//To calculate number of zero between 2 index(i, j) = ZeroCount[j] - ZeroCount[i - 1]
// we have to find number of subarrays with equal zeros and ones.
//equation for checking =  OneCount[j] - OneCount[i - 1] = ZeroCount[j] - ZeroCount[i - 1]
// if above equation holds true than we get a valid subarray starting from i and ending at j
//modify the above eq =  ZeroCount[i - 1] - OneCount[i - 1] = ZeroCount[j] - OneCount[j]
//now we have to find all the pair of (i, j) that satisies the modified equation
import java.util.*;
class CountSubarrayWithEqual0And1{
	public static void main(String[] args){
		String s = "1001011";
		int[] ZeroCount = new int[s.length()];   //prefix array of zero count
		int[] OneCount = new int[s.length()];    //prefix array one count
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		map.put(0 , 1);

		if(s.charAt(0) == '0'){
			ZeroCount[0] = 1;
		}
		else{
			OneCount[0] = 1;
		}
		for(int i = 1; i < s.length(); i++){
			char c = s.charAt(i);

			if(c == '0'){
				ZeroCount[i] = ZeroCount[i - 1] + 1;
			}
			else{
				ZeroCount[i] = ZeroCount[i - 1];	
			}


			if(c == '1'){
				OneCount[i] = OneCount[i - 1] + 1;
			}
			else{
				OneCount[i] = OneCount[i - 1];	
			}
		}

		for(int j = 0; j < s.length(); j++){
			int diff = ZeroCount[j] - OneCount[j];

			//checking if their exist (i - 1) corresponding to the difference
			//if yes then we found the subarray
			if(map.containsKey(diff)){
				count += map.get(diff);
				map.put(diff , map.get(diff) + 1);
			}
			else{
				map.put(diff, 1);
			}
		}
		System.out.println(count);
	}
}