class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode t = head;

        int n = 1;

        while(t.next != null) {
            t = t.next;
            n++;
        }

        k %= n;
        if(k==0) return head;

        n -= k;

        t.next = head;
        t = head;

        while(n > 1) {
            t = t.next;
            n--;
        }

        ListNode s = t.next;
        t.next = null;

        return s;
    }
}