package FAQ.Imp.LinkedList;

public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ln = new ListNode();
		ListNode head = ln.returnList();
		ReverseLinkedList rl = new ReverseLinkedList();
		rl.reverseList(head);

	}

}
