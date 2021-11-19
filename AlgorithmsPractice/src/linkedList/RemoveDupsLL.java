package linkedList;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class RemoveDupsLL {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {};
		ListNode(int val) { this.val = val; };
		ListNode(int val, ListNode next) { this.val = val; this.next = next; };
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if (head.next == null) 
			return head;
		
		ListNode current = head;
		while (current.next != null) {
			if (current.val == current.next.val) 
				current.next = current.next.next;
			else
				current = current.next;
		}
		
		return head;
	}
	
	public static LinkedList<Integer> deleteDuplicatesLL(LinkedList<Integer> ll) {
		if (ll.size() < 0)
			return ll;
		int current = 0;
		
		while (current < ll.size() - 1) {
			if (ll.get(current) == ll.get(current + 1))
				ll.remove(current + 1);
			else 
				current += 1;
		}
		
		return ll;
	}
	
	public static LinkedList<Integer> deleteDuplicatesLL2(LinkedList<Integer> ll) {
		
		if (ll.size() < 0)
			return ll;
		
		Iterator<Integer> it = ll.iterator();
		int current = it.next();
		
		while (it.hasNext()) {
			int next = it.next();
			if (current == next) {
				it.remove();
			}
			else 
				current = next;
		}
		return ll;
	}
	@Test
	public static void test() {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(1);
		ll1.add(1);
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(3);
		ll1.add(4);
		deleteDuplicatesLL(ll1);
		
		System.out.println(Arrays.toString(ll1.toArray()));
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(1);
		ll2.add(2);
		ll2.add(3);
		ll2.add(4);
		
		assertEquals(ll1.toString(), ll2.toString());
	}
	
	public static void main(String[] args) {
		test();
	}
	
}

/* 
 * 1 > 1x >  1x > 2 > 3 > 3x > 4
 * get current, compare to next
 * if current is not equal, set current to current.next
 * if it is equal, set current.next to current.next.next but don't change current in case there is more than one dup
 */