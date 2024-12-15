class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode sap=new ListNode(-1);
    sap.next=head;
    ListNode t=head;
    if(head==null)
    return null;
  
    ListNode t1=sap;

    while(t!=null)
    {
        if(t.val==val)
        {
            t1.next=t.next;
        }
        else
        {
          
        t1=t;
        }
        t=t.next;

    }
    return sap.next;
    }
}
