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
	
	public ListNode reverseListIteratively( ListNode head ){
		if ( head == null || head.next == null ){
			return head;
		}
		ListNode runner = head.next;
		while ( true ){
			if ( runner.next == null ){
				runner.next = head;
				return runner;
			}
			ListNode next = runner.next;
			runner.next = head;
			head = runner;
			runner = next;
		}
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

