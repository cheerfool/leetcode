package list;

public class RemoveNthEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        int size=1;
        ListNode current=head;
        while(current.next!=null){
            current= current.next;
            size++;
        }
        if(n==size){
            current=head.next;
            head.next=null;
            return current;
        }
        int target= size-n-1;
        current=head;
        for(int i=0; i<target; i++){
            current=current.next;
        }
        ListNode rmNode= current.next;
        ListNode nextNode= rmNode.next;
        current.next= nextNode;
        rmNode.next= null;
        return head;
    }
}
