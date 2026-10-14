
class StackArray {
    private int[] arr;
    private int top = -1;

    StackArray(int size) {
        arr = new int[size];
    }

    void push(int value) {
        if (top == arr.length - 1)
            throw new RuntimeException("Stack Overflow");

        arr[++top] = value;
    }

    int pop() {
        if (top == -1)
            throw new RuntimeException("Stack Underflow");

        return arr[top--];
    }

    int peek() {
        if (top == -1)
            throw new RuntimeException("Stack is empty");

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}