package linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void testReverseOfNoElements() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		ListNode reversedList = reverser.reverseList( null );
		
		assertEquals( null, reversedList );
	}
	
	@Test
	public void testReverseOfOneElements() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		
		ListNode reversedList = reverser.reverseList( n );
		assertEquals( n, reversedList );
	}
	
	@Test
	public void testReverseOfTwoElements() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		ListNode next = new ListNode( 6 );
		n.next = next; 
		
		ListNode reversedList = reverser.reverseList( n );
		assertEquals( next, reversedList );
	}
	
	
	@Test
	public void testReverseOfThreeElements() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		ListNode second = new ListNode( 6 );
		ListNode third = new ListNode( 7 );
		n.next = second;
		second.next = third;
		
		ListNode reversedList = reverser.reverseList( n );
		assertEquals( third, reversedList );
		assertEquals( second, reversedList.next );
		assertEquals( n, reversedList.next.next );
	}
	
	
	@Test
	public void testReverseOfNoElements_iteratively() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		ListNode reversedList = reverser.reverseListIteratively( null );
		
		assertEquals( null, reversedList );
	}
	
	@Test
	public void testReverseOfOneElements_iteratively() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		
		ListNode reversedList = reverser.reverseListIteratively( n );
		assertEquals( n, reversedList );
	}
	
	@Test
	public void testReverseOfTwoElements_iteratively() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		ListNode next = new ListNode( 6 );
		n.next = next; 
		
		ListNode reversedList = reverser.reverseListIteratively( n );
		assertEquals( next, reversedList );
	}
	
	
	@Test
	public void testReverseOfThreeElements_iteratively() {
		ReverseLinkedList reverser = new ReverseLinkedList();
		
		ListNode n = new ListNode( 5 );
		ListNode second = new ListNode( 6 );
		ListNode third = new ListNode( 7 );
		n.next = second;
		second.next = third;
		
		ListNode reversedList = reverser.reverseListIteratively( n );
		assertEquals( third, reversedList );
		assertEquals( second, reversedList.next );
		assertEquals( n, reversedList.next.next );
	}
	
	

}
