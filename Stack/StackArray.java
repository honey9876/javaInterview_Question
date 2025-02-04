package Stack;

class StackArray {
    int top, size;
    int[] stack;

    public StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (top == -1) return -1;
        return stack[top--];
    }

    int peek() {
        return (top == -1) ? -1 : stack[top];
    }

    public class Main {
        public static void main(String[] args) {
            StackArray stack = new StackArray(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println(stack.pop());  // 30
            System.out.println(stack.peek()); // 20
            stack.push(40);
            System.out.println(stack.pop());  // 40
        }
    }
    
}
