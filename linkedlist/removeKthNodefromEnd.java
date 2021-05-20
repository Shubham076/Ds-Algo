import java.util.*;
class removeKthNodefromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode slow = head, fast = head;

		//Move fast in front so that the gap between slow and fast becomes n
		for (int i = 0; i < n; i++)   {
			fast = fast.next;
		}

		//means we have to remove the starting node
		if (fast == null) return head.next;

		//Move fast to the end of list, maintaining the gap
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		//Skip the desired node
		slow.next = slow.next.next;
		return head;
	}