public class ReverseLLinK {
    public static void main(String[] args) {
        RLinkedList list = new RLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.insert(100);

        System.out.println("Original list: ");
        list.print();

        list.reverseInK(3);

        System.out.println("List after reversing in groups of 3: ");
        list.print();
    }
}

class RNode {
    int data;
    RNode next;
    RNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class RLinkedList {
    RNode head;

    RLinkedList() {
        this.head = null;
    }

    void insert(int data) {
        RNode nn = new RNode(data);

        if(head == null) {
            head = nn;
        }

        else {
            RNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nn;
        }
    }

    void print() {
        RNode temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void reverseInK(int k) {
        head = reverseInK(head, k);
    }

    RNode reverseInK(RNode head, int k) {
        RNode curr = head;
        RNode prev = null;
        RNode next = null;

        RNode temp;

        int count = 0;

        temp = curr;

        while(temp != null) {
            temp = temp.next;
            count++;
        }

        if(count < k) {
            return head;
        }

        count = 0;

        while(count < k) {
            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

            count++;
        }


        if(next != null) {
            head.next = reverseInK(next, k);
        }
        
        return prev;
    }
}

