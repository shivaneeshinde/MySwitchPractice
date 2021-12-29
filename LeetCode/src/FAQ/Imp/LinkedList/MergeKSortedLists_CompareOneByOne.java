package FAQ.Imp.LinkedList;

public class MergeKSortedLists_CompareOneByOne {
	 
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
	  
    public ListNode mergeTwoList(ListNode head, ListNode temp){
        ListNode newNodeList = null;
        while(head!=null && temp!=null){
            if(head.val < temp.val){
                newNodeList = addToLast(newNodeList, head.val);
                head = head.next;
            }
            else{
                newNodeList = addToLast(newNodeList, temp.val);
                temp = temp.next;
            }
        }
        while(head!=null){
            newNodeList = addToLast(newNodeList, head.val);
            head = head.next;
        }
        while(temp!=null){
            newNodeList = addToLast(newNodeList, temp.val);
            temp = temp.next;
        }
        return newNodeList;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        if(lists.length == 0){
            return head;
        }
        else if(lists.length==1){
            return lists[0];
        }
        else if(lists.length>=2){
            head = lists[0];
            for(int i=1; i<lists.length; i++){
                ListNode temp = lists[i];
                head = mergeTwoList(head,temp);
            }
        }
        
        return head;
    }

}
