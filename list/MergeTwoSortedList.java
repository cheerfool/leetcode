package list;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1= l1;
        ListNode p2= l2;
        ListNode guide= new ListNode(0);
        ListNode p3= guide;
        while(p1!=null||p2!=null){
            if(p1==null){
                p3.next= p2;
                p2= p2.next;
            }else if(p2==null){
                p3.next= p1;
                p1= p1.next;
            }else{
                if(p1.val < p2.val){
                    p3.next= p1;
                    p1= p1.next;
                }else{
                    p3.next= p2;
                    p2= p2.next;
                }
            }
            p3= p3.next;
        }
        return guide.next;
    }
}
