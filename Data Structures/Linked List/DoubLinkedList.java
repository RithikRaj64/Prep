public class DoubLinkedList {
    public static void main(String[] args) {
        
    }
}

class DNode {
    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DList {
    DNode head;

    DList() {
        this.head = null;
    }

    void insert(int val) {
        DNode nn = new DNode(val);

        if(this.head == null) {
            head = nn;
        }

        DNode temp = this.head;

        while(temp.next != null) {
            temp = temp.next;
        }

        nn.prev = temp;

        temp.next = nn;
    }

    void print() {
        DNode temp = this.head;

        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
    }

    void printReverse() {
        DNode temp = this.head;

        while(temp.next != null) temp = temp.next;

        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }
    }

    void delete(int val) {
        DNode temp = this.head;

        while(temp.val != val) temp = temp.next;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    void insertAtBeginning(int val) {
        DNode nn = new DNode(val);

        if(this.head == null) {
            this.head = nn;
            return;
        }

        this.head.prev = nn;
        nn.next = this.head;
        this.head = nn;
    }

    void insertAtIndex(int val, int index) {
        DNode nn = new DNode(val);

        if(index == 0) insertAtBeginning(val);

        else {
            DNode temp = this.head;

            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }

            if(temp == null) {
                System.out.println("Index out of bounds!!");
                return;
            }

            nn.next = temp.next;
            nn.prev = temp;
            temp.next.prev = nn;
            temp.next = nn;
        }
    }
}