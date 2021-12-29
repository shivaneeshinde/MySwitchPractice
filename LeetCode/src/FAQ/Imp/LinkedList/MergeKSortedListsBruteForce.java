package FAQ.Imp.LinkedList;

/*
 * Approach 1: Brute Force
Intuition & Algorithm

Traverse all the linked lists and collect the values of the nodes into an array.
Sort and iterate over this array to get the proper value of nodes.
Create a new sorted linked list and extend it with the new nodes.
 * */

public class MergeKSortedListsBruteForce {
	
    public ListNode addToLast(ListNode head, Integer data){
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> listNum = new ArrayList<Integer>();
        for(ListNode temp : lists){
            while(temp!=null){
                listNum.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(listNum);
        ListNode head = null;
        for(Integer num : listNum){
            head = addToLast(head, num);
        }
        return head;
    }   

}
