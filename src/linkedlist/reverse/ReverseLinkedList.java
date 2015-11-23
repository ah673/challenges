package linkedlist.reverse;

public class ReverseLinkedList {
	
	public ListNode reverseList( ListNode head ){
		if( head == null || head.next == null ){
			return head;
		}
		ListNode newHead = reverseList( head.next );
		head.next.next = head;
		
		return newHead;
	}
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode( int x ){ val = x; }
		
		@Override
		public String toString(){
			return String.valueOf(val);
		}
	}
}

