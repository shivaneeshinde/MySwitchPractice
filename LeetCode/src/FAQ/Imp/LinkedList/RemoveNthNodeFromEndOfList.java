package FAQ.Imp.LinkedList;

public class RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        if(temp == null){
            return null;
        }
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        if(length == 1){
            return null;
        }
        else{
            int startLen = length - n;
            if(startLen == 0){
                return head.next;
            }
            int i=0;
            temp = head;
            ListNode prev = head;
            while(i<startLen){
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
        }
        return head;
    }
	
	public ListNode removeNthFromEndTwoPointer(ListNode head, int n) {
        ListNode tail = head;
        ListNode temp = head;
        ListNode prev = null;
        int i=0;
        while(i<n){
            tail = tail.next;
            i++;
        }
        if(tail == null){
            return null;
        }
        while(tail!=null){
            prev = temp;
            temp = temp.next;
            tail = tail.next;
        }
        prev.next = temp.next;
        return head;
    }

}
