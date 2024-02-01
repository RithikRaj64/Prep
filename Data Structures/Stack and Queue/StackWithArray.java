public class StackWithArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.push(6);

        System.out.println(s.isFull());

        while(!s.isEmpty()) System.out.println(s.pop());
    }
}

class Stack {
    int arr[];
    int top;
    int size;

    Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = size;
    }

    void push(int val) {
        top++;
        if(top == size) {
            System.out.println("Stack is full");
            top--;
            return;
        }
        arr[top] = val;
    }

    int peek() {
        if(this.isEmpty()) return -1;

        return arr[top];
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int x = arr[top];
        top--;
        return x;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size-1;
    }
}