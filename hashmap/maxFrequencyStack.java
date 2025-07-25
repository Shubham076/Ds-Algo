import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class maxFrequencyStack {

	HashMap<Integer, Stack<Integer>> map;
	HashMap<Integer, Integer> freq;
	int max = Integer.MIN_VALUE;

	public maxFrequencyStack() {
		map = new HashMap<>();
		freq = new HashMap<>();
	}

	public void push(int val) {
		freq.put(val, freq.getOrDefault(val, 0) + 1);
		int f = freq.get(val);

		if (f > max) {
			max = f;
		}

		if (map.containsKey(f)) {
			Stack<Integer> s = map.get(f);
			s.push(val);
		} else {
			Stack<Integer> s = new Stack<>();
			s.push(val);
			map.put(f, s);
		}
	}

	public int pop() {
		int ans = map.get(max).pop();
		Stack<Integer> s = map.get(max);
		if (s.isEmpty()) {
			map.remove(max);
			max--;
		}

		int f = freq.get(ans);
		if (f > 1) {
			freq.put(ans, f - 1);
		} else {
			freq.remove(ans);
		}
		return ans;
	}
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
