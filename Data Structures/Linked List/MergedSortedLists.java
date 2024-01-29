public class MergedSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn = new ListNode(-1);

        ListNode t = nn;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                t.next = list1;
                list1 = list1.next;
            }
            else {
                t.next = list2;
                list2 = list2.next;
            }
            t = t.next;
        }

        t.next = list1 != null ? list1 : list2;

        return nn.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}