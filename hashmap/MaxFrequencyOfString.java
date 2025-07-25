import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MaxFrequencyOfString {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(maxFrequency(str));
	}
	public static char maxFrequency(String str) throws Exception {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc); //ov=old value
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}

		System.out.println(map);

		char maxchar = '\0';
		int max = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		return maxchar;
	}
}
