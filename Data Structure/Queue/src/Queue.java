class Queue {

    int[] arr;
    int front;
    int rear;
    int size;

    Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        arr[++rear] = data;
    }

    int dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return arr[front++];
    }

    int peek() {

        if (front > rear) {
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return front > rear;
    }
}

