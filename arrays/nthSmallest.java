
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class nthSmallest {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 31, 4, 15, 81, 90, 23, 78, 12 };
		int k = 3;
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr) {
			minheap.add(i);
			if (minheap.size() > k) {
				minheap.remove();
			}
		}
		System.out.println(minheap.remove());
		for (int i : arr) {
			maxheap.add(i);
			if (maxheap.size() > k) {
				maxheap.remove();
			}
		}
		System.out.println(maxheap.remove());
	}
}
