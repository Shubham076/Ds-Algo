public class heapclient {

	public static void main(String[] args) {
		Heap<Integer> h = new Heap<>();
			h.add(4);
			h.add(1);
			h.add(9);
			h.add(2);
			h.add(3);

		h.display();
		// System.out.println();
		// System.out.println(h.peek());
		// h.remove();
		// h.display();
	}

}
