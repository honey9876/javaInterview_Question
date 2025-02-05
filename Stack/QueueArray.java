package Stack;

class QueueArray {
    int[] queue;
    int front, rear, size;

    public QueueArray(int size) {
        queue = new int[size];
        front = rear = -1;
        this.size = size;
    }

    void enqueue(int data) {
        if (rear == size - 1) return;
        if (front == -1) front = 0;
        queue[++rear] = data;
    }

    int dequeue() {
        if (front == -1 || front > rear) return -1;
        return queue[front++];
    }



   public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue()); // 10
        q.enqueue(30);
        System.out.println(q.peek());    // 20
    }
 }
}
