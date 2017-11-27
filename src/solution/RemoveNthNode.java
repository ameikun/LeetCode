package solution;

import map1.ListNode;
import map1.modle;

public class RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		
		ListNode q = head;//快指针
		ListNode s = head;//慢指针
		for (int i = 0; i < n; i++) {
			q = q.next;	
		}
		if (q == null) {
			head = head.next;
			return head;
		}
		while (q.next!=null) {
			q = q.next;
			s = s.next;	
		}
		s.next = s.next.next;
		return head;	
	}

}
