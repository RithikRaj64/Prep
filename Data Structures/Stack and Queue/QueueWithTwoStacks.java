import java.util.Stack;

public class QueueWithTwoStacks {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.dequeue());

        q.enqueue(5);
        q.enqueue(6);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

class Queue {
    Stack<Integer> en;
    Stack<Integer> de;

    Queue() {
        en = new Stack<Integer>();
        de = new Stack<Integer>();
    }

    void enqueue(int val) {
        en.push(val);
    }

    int dequeue() {
        if(de.isEmpty()) {
            while(!en.isEmpty()) de.push(en.pop());
        }

        if(de.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return de.pop();
    }
}
