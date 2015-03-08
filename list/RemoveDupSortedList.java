package list;

public class RemoveDupSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode tail= head;
        ListNode cur= head.next;
        while(cur!=null){
            if(cur.val!=tail.val){
                tail.next= cur;
                tail= cur;
            }
            cur= cur.next;
        }
        return head;
    }
}
