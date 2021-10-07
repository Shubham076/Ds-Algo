public class heapclient {

	public static void main(String[] args) {
		Heap<Integer> h = new Heap<>();
			int[] arr = {1,2,3,4,5};
			for(int v : arr){
				h.add(v);
			}

		h.display();
		// System.out.println();
		// System.out.println(h.peek());
		// h.remove();
		// h.display();
	}

}
