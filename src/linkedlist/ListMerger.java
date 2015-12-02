package linkedlist;
/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * @author amyho
 *
 */
public class ListMerger {
	
	public ListNode merge( ListNode l1, ListNode l2 ){
		if ( l1 == null ){
			return l2;
		} else if ( l2 == null ){
			return l1;
		}
		
		
		ListNode merged = null;
		ListNode tail = merged;
		
		while ( l1 != null && l2 != null ){
			ListNode minNode = null;
			if ( l1.val < l2.val ){
				minNode = l1;
				l1 = l1.next;
			} else {
				minNode = l2;
				l2 = l2.next;
			}
			
			if ( merged == null ){
				merged = minNode;
				tail = minNode;
			} else {
				tail.next = minNode;
				tail = tail.next;
			}
		}
		
		if ( l1 != null ){
			tail.next = l1;
		} else {
			tail.next = l2;
		}
		
		return merged;
	}
}
