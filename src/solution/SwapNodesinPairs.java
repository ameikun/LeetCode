package solution;

import map1.ListNode;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		
		if (head==null || head.next == null) {
			return head;
		}
		
	
		ListNode temphead = new ListNode(0);
		temphead.next = head;
		ListNode p = temphead;
		ListNode q = head;
		
		while (q!=null&&q.next!=null) {
			head = q.next.next;
			p.next = q.next;
			q.next.next = q;
			q.next = head;
			p = q;
			q= head;
		}
		
		return temphead.next;        
    }

}
