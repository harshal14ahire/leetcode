/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNodea(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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