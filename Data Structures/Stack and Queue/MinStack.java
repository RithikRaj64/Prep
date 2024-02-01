public class MinStack {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(8);
        st.push(-9);
        st.push(500);

        System.out.println(st.getMin());
        System.out.println(st.top());

        st.pop();
        st.pop();

        System.out.println(st.getMin());
        System.out.println(st.top());
    }
}

class Stack {
    Node head;

    public Stack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null) head = new Node(val, val, null);
        else head = new Node(val, Math.min(val, head.m), head);
    }
    
    public void pop() {
        head = head.n;
    }
    
    public int top() {
        return head.d;
    }
    
    public int getMin() {
        return head.m;
    }
}

class Node {
    int d;
    int m;
    Node n;

    Node(int d, int m, Node n) {
        this.d = d;
        this.m = m;
        this.n = n;
    }
}
