public class heapclient {

	public static void main(String[] args) {
		Heap<Integer> h = new Heap<>();
			h.add(23);
			h.add(85);
			h.add(12);
			h.add(66);
			h.add(45);
			h.add(15);
			h.add(5);

		h.display();
		// System.out.println();
		// System.out.println(h.peek());
		// h.remove();
		// h.display();
	}

}
