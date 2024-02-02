package RealTime.Bank;

public class Logs {
    TransactionNode head;

    Logs() {
        head = null;
    }

    void insert(double amount, String type) {
        TransactionNode nn = new TransactionNode(amount, type);
    
        if(head == null) {
            head = nn;
            return;
        }

        TransactionNode temp = head;

        while(temp.next != null) temp = temp.next;

        temp.next = nn;
    }

    void print() {
        TransactionNode temp = head;

        while (temp != null) {
            System.out.println(temp.getDate() + "    ::    " + temp.getType() + "    ::    " + temp.getAmount());
            temp = temp.next;
        }
    }
}

class TransactionNode extends Transaction {
    TransactionNode next;

    TransactionNode(double amount, String type) {
        super(amount, type);
        this.next = null;
    }
}