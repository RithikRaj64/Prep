package RealTime.Bank;

public class AccountsList {
    AccountNode head;

    AccountsList() {
        head = null;
    }

    void createAccount(String holder, double balance) {
        AccountNode nn = new AccountNode(holder, balance);

        if(head == null) {
            head = nn;
            return;
        }

        AccountNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nn;

        return;
    }

    void displayAllAccounts() {
        AccountNode temp = head;

        while(temp != null) {
            System.out.println(temp.getHolder());
            temp = temp.next;
        }
    }

    AccountNode selectAccount(String holder) {
        AccountNode temp = head;

        while(temp != null) {
            if(temp.getHolder().equals(holder)) return temp;
            temp = temp.next;
        }

        return null;
    }
}

class AccountNode extends Account{
    AccountNode next;

    AccountNode(String holder, double balance) {
        super(holder, balance);
        this.next = null;
    }
}