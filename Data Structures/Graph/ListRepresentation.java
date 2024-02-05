public class ListRepresentation {
    public static void main(String[] args) {
        int graph[][] = {
            {0, 1, 1, 0}, 
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
        };

        SrcList li = new SrcList();
        DesList dli;

        for(int i=0; i<4; i++) {
            dli = new DesList();

            for(int j=0; j<4; j++) {
                if(graph[i][j] == 1) dli.insert(j);
            }

            li.insert(i, dli);
        }

        li.print();
    }
}

class SrcNode {
    int val;
    SrcNode next;
    DesList dest;

    SrcNode(int val, DesList dli) {
        this.val = val;
        this.next = null;
        this.dest = dli;
    }
}

class DesNode {
    int val;
    DesNode next;

    DesNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class SrcList {
    SrcNode head;

    SrcList() {
        this.head = null;
    }

    void insert(int val, DesList dli) {
        SrcNode nn = new SrcNode(val, dli);

        if(head == null) {
            head = nn;
            return;
        }

        SrcNode temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = nn;

        return;
    }

    void print() {
        SrcNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp.dest.print();
            temp = temp.next;
        }
    }
}

class DesList {
    DesNode head;

    DesList() {
        this.head = null;
    }

    void insert(int val) {
        DesNode nn = new DesNode(val);

        if(head == null) {
            head = nn;
            return;
        }

        DesNode temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = nn;

        return;
    }

    void print() {
        DesNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}