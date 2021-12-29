package FAQ.Imp.LinkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists {
	
    public ListNode addLast(int data, ListNode merge){
        ListNode node = new ListNode(data);
        if(merge == null){
            merge = node;
        }
        else{
            ListNode temp = merge;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        return merge;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merge = null;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                merge = addLast(l1.val,merge);
                l1=l1.next;
            }
            else{
                merge = addLast(l2.val,merge);
                l2=l2.next;
            }
        }
        while(l1!=null){
            merge = addLast(l1.val,merge);
            l1=l1.next;
        }
        while(l2!=null){
            merge = addLast(l2.val,merge);
            l2=l2.next;
        }
        return merge;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
