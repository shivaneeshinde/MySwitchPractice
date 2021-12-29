package FAQ.Imp.LinkedList;

public class MergeKSortedLists_PriorityQueue {

	public ListNode addToLast(ListNode head, Integer data) {
		ListNode temp = head;
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for (ListNode temp : lists) {
			while (temp != null) {
				pQueue.add(temp.val);
				temp = temp.next;
			}
		}
		ListNode head = null;
		while (!pQueue.isEmpty()) {
			head = addToLast(head, pQueue.poll());
		}
		return head;
	}
}
