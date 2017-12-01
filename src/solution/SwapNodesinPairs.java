package solution;

import map1.ListNode;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode headres = new ListNode(0);
		ListNode temphead = new ListNode(0);
		ListNode p = head;
		ListNode q = head;
		temphead = head.next;
		head = temphead.next;
		while (temphead!=null) {
			p = temphead;
			q = temphead.next.next;
			temphead.next = p;
			p.next = q;
			temphead = q;	
		}
		
		return head;        
    }

}
