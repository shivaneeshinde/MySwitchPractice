package FAQ.Imp.LinkedList;

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            else{
                set.add(temp);
            }
            temp = temp.next;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
