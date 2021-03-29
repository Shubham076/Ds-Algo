import java.util.*;
public class maxFreqofSTR {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(maxFreq(str));
	}
	public static char maxFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
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
		for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		return maxchar;
	}
}
