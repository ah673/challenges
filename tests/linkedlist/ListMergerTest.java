package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListMergerTest {
	
	@Test
	public void mergingOfOneList(){
		ListMerger merger = new ListMerger();
		
		ListNode l1 = createList( 1, 5 );
		ListNode mergedList = merger.merge( l1, null );
		
		assertEquals( 1, mergedList.val );
		assertEquals( 5, mergedList.next.val );
		
	}
	
	@Test
	public void mergingOfTwoLists(){
		ListMerger merger = new ListMerger();
		
		ListNode l1 = createList( 1, 5 );
		ListNode l2 = createList( 2, 3, 7, 9 );
		
		ListNode mergedList = merger.merge( l1, l2 );
		assertEquals( 1, mergedList.val );
		assertEquals( 2, mergedList.next.val );
		assertEquals( 3, mergedList.next.next.val );
		assertEquals( 5, mergedList.next.next.next.val );
		assertEquals( 7, mergedList.next.next.next.next.val );
		assertEquals( 9, mergedList.next.next.next.next.next.val );
	}

	private ListNode createList( int...vals ) {
		ListNode head = null;
		ListNode tail = null;
		for ( int val : vals ){
			ListNode node = new ListNode( val );
			if ( head == null ){
				head = node;
				tail = head;
			} else {
				tail.next = node;
				tail = tail.next;
			}
		}
		
		return head;
		
	}

}
