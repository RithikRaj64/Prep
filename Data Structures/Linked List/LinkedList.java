public class LinkedList {
    public static void main(String[] args) {
        List list = new List();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original list: ");
        list.print();

        list.insertAtBeginning(5);

        System.out.println("List after inserting 5 at the beginning: ");
        list.print();

        list.insertAtIndex(25, 3);

        System.out.println("List after inserting 25 at index 3: ");
        list.print();

        list.delete(25);

        System.out.println("List after deleting 25: ");
        list.print();

        list.deleteByIndex(3);

        System.out.println("List after deleting element at index 3: ");
        list.print();

        System.out.println("List after reversing: ");
        list.head = list.reverse(list.head);
        list.print();
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    List() {
        this.head = null;
    }

    void insert(int data) {
        Node nn = new Node(data);

        if(head == null) {
            head = nn;
        }

        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nn;
        }
    }

    void insertAtBeginning(int data) {
        Node nn = new Node(data);

        if(head == null) {
            head = nn;
        }

        else {
            nn.next = head;
            head = nn;
        }
    }

    void insertAtIndex(int data, int index) {
        Node nn = new Node(data);

        if(index == 0) {
            nn.next = head;
            head = nn;
        }

        else {
            Node temp = head;

            for(int i=0; i<index-1; i++) {
                temp = temp.next;

                if(temp == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
            }

            nn.next = temp.next;
            temp.next = nn;
        }
    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }

    void delete(int data) {
        Node temp = head;

        if(temp.data == data) {
            head = temp.next;
        }
        else {
            while(temp.next.data != data) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
    }

    void deleteByIndex(int index) {
        Node temp = head;

        if(index == 0) {
            head = temp.next;
        }
        else {
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
                
                if(temp == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
            }

            temp.next = temp.next.next;
        }
    }

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null) {
            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        return prev;
    }
}
