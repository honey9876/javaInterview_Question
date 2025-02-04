package Stack;

class StackLL {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) return -1;
        int data = top.data;
        top = top.next;
        return data;
    }

    int peek() {
        return (top != null) ? top.data : -1;
    }
}

public class Main {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        stack.push(30);
        System.out.println(stack.peek());
    }
}