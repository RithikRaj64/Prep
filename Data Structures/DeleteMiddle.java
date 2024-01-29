public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        ListNode tor = head.next;

        if(head.next == null) return null;

        ListNode har = head.next.next;
        ListNode prev = head;

        while(har != null && har.next != null) {
            prev = tor;
            tor = tor.next;
            har = har.next.next;
        }

        prev.next = prev.next.next;

        return head;
    } 
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
