package linkedList;

public class IntersectionLinkedLists {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {};
		ListNode(int val) { this.val = val; };
		ListNode(int val, ListNode next) { this.val = val; this.next = next; };
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) { 

		if (headA == null || headB == null) 
			return null; 

		int sizeA = size(headA); 
		int sizeB = size(headB); 

		ListNode longer = (sizeA >= sizeB) ? headA : headB; 

		ListNode shorter = (sizeA < sizeB) ? headA : headB; 

		int incrementLonger = Math.abs(sizeA - sizeB); 

		for (int i = incrementLonger; i > 0; i++) { 
			longer = longer.next; 
		} 

	ListNode intersection = null; 

	while (longer != null && shorter != null) { 
		if (headA == headB) { //compare references  
			intersection = headA; 
			break; 
		}
		
		longer = longer.next; 
		shorter = shorter.next; 
	} 

	return intersection; 

	} 

	 

	public static int size(ListNode head) { 

		if (head == null) 
			return 0; 

		int count = 0;    
		ListNode current = head.next; 

		while (current != null) { 
			count+= 1; 
			current = head.next;  
		} 

		return count; 
	} 
}
