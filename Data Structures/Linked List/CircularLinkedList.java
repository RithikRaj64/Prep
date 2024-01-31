public class CircularLinkedList {
    public static void main(String[] args) {
        
    }
}

class CNode {
    int val;
    CNode next;

    CNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class CList {
    CNode head;

    CList() {
        this.head = null;
    }

    void insert(int val) {
        CNode nn = new CNode(val);
        nn.next = this.head;

        if(this.head == null) {
            this.head = nn;
            return;
        }

        CNode temp = this.head;

        while(temp.next != this.head) {
            temp = temp.next;
        }

        temp.next = nn;
    }

    void delete(int val) {
        CNode temp = this.head;

        if(temp.val == val) {
            head = temp.next;
        }
        else {
            while(temp.next.val != val) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
    }

    void print() {
        CNode temp = this.head;

        while(temp.next != this.head) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.val);
    }
}
