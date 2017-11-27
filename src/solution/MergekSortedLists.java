package solution;

import map1.ListNode;

public class MergekSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		int len = lists.length;
		if (lists == null||len == 0) {
			return null;
		}
		if (len == 1) {
			return lists[0];
		}
		
		while (len>1) 
		{
			int mid = (len+1)/2;
			for (int i = 0; i < len/2; i++) {
				lists[i]=twoNode(lists[i],lists[i+mid]); 
			}
			len = mid;	
		}	
		return lists[0];
	}
	
	
	public ListNode twoNode(ListNode p,ListNode q) {
		
		ListNode head = new ListNode(0);
		ListNode r = head;
		while (p != null && q != null) {
			if (p.val<q.val) {
				r.next = p;
				p = p.next;
				r = r.next;
			}else {
				r.next = q;
				q = q.next;
				r = r.next;
			}
		}
		if (p!=null) 
			r.next = p;
		else
			r.next = q;
		return head.next;
	}

}
