// Floyd's Tortoise and Hare algorithm

// - The tortoise and hare start at the same position.
// - The hare moves two steps at a time, and the tortoise moves one step at a time.
// - If there is a cycle, the hare will eventually catch up to the tortoise.
// - If there is no cycle, the hare will reach the end of the list.

public class LLCycle {
    public static void main(String[] args) {
        CLinkedList ll = new CLinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        ll.print();

        if(ll.hasCycle()) {
            System.out.println("Cycle detected");
        }
        else {
            System.out.println("No cycle detected");
        }

        ll.head.next.next.next.next.next = ll.head.next;

        ll.head.next = ll.head;

        if(ll.hasCycle()) {
            System.out.println("Cycle detected");
        }
        else {
            System.out.println("No cycle detected");
        }

        CNode cycleNode = ll.detectCycleWithNode(ll.head);

        if(cycleNode != null) {
            System.out.println("Cycle detected at node: " + cycleNode.data);
        }
        else {
            System.out.println("No cycle detected");
        }
    }
}

class CNode {
    int data;
    CNode next;
    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CLinkedList {
    CNode head;

    CLinkedList() {
        this.head = null;
    }

    void insert(int data) {
        CNode nn = new CNode(data);

        if(head == null) {
            head = nn;
        }

        else {
            CNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nn;
        }
    }

    void print() {
        CNode temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    boolean hasCycle() {
        if(head == null || head.next == null) return false;

        CNode tortoise = head;
        CNode hare = head.next;

        while(tortoise != hare) {
            if(hare == null || hare.next == null) return false;

            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return true;
    }

    public CNode detectCycleWithNode(CNode head) {
        if(head == null) return null;

        CNode tortoise = head;
        CNode hare = head;

        while(true) {
            if(hare == null || hare.next == null) return null;
            
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if(hare == tortoise) {
                tortoise = head;

                while(hare != tortoise) {
                    tortoise = tortoise.next;
                    hare = hare.next;
                }

                return tortoise;
            }
        }
    }
}



