class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Initialize a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next; // Move temp forward
        }

        // Attach any remaining nodes from list1 or list2
        while (list1 != null) {
            temp.next = new ListNode(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }

        while (list2 != null) {
            temp.next = new ListNode(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }

        // Return the merged list starting from the next of dummy
        return dummy.next;
    }
}
