import java.util.Scanner;

public class QueueWithArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine();
        
        Queue q = new Queue(n);
        
        String ch = s.nextLine();
        
        while(!ch.equals("Exit")) {
            if(ch.equals("Enqueue")) {
                q.enqueue(s.nextInt());
                s.nextLine();
            }
            else if(ch.equals("Dequeue")) {
                q.dequeue();
            }
            else if(ch.equals("Print")) {
                q.print();
            }
            
            ch = s.nextLine();
        }

        s.close();
    }
}

class Queue {
    int arr[];
    int size;
    int front;
    int rear;
    
    Queue(int size) {
        arr = new int[size];
        this.size = size;
        front = 0;
        rear = 0;
    }
    
    void enqueue(int val) {
        if(rear == size) {
            System.out.println("Overflow");
            return;
        }
        
        arr[rear++] = val;
    }
    
    void dequeue() {
        if(front == rear) {
            System.out.println("Underflow");
            return;
        }
        
        for(int i=0; i<rear-1; i++) {
            arr[i] = arr[i+1];
        }
        
        rear--;
    }
    
    void print() {
        while(front < rear) {
            System.out.println(arr[front++]);
        }
    }
}