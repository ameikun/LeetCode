package solution;

import map1.ListNode;
/**
 * extend Swap Nodes in Pairs*/

public class ReNodeskGroup { 
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head==null || head.next == null) {
			return head;
		}
		ListNode res = new ListNode(0);
		res.next = head;
		ListNode a = res;
		
		ListNode temp = head;
		int i=0;
		while (temp!=null) {
			i++;
			temp = temp.next;
			
		}
		
		while (i >= k) {
			for (int j = 1; j < k; j++) {
				ListNode node = a.next;
				a.next = head.next;
				head.next = a.next.next;
				a.next.next = node;
			}
			a = head;
			head = head.next;
			i = i - k;
		}
		return res.next;
	}

}
