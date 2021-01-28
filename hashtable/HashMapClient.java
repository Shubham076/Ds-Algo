import java.util.ArrayList;
public class HashMapClient {

	public static void main(String[] args) throws Exception {
		HashMap<Character , String> map = new HashMap<>();
		map.put('A' , "Anubhav");
		map.put('B' , "Bhoomika");
		map.put('C' , "Chiya");
		map.put('D' , "Delhi");
		map.put('S' , "Shubham");

		map.display();
		System.out.println("Size is " + map.size());
		System.out.println(map.get('q'));
		System.out.println(map.get('S'));

		ArrayList<Character> l = map.keySet();
		System.out.println(l);
		map.remove('B');

		System.out.println();
		map.display();

	}
}
