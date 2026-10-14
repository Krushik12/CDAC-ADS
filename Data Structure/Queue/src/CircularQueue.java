
public class CircularQueue {

	    int[] arr;
	    int front;
	    int rear;
	    int size;
	    int count;

	    CircularQueue(int size) {

	        this.size = size;
	        arr = new int[size];

	        front = 0;
	        rear = -1;
	        count = 0;
	    }

	    void enqueue(int data) {

	        if (count == size) {
	            System.out.println("Queue Overflow");
	            return;
	        }

	        rear = (rear + 1) % size;

	        arr[rear] = data;

	        count++;
	    }

	    int dequeue() {

	        if (count == 0) {
	            System.out.println("Queue Underflow");
	            return -1;
	        }

	        int data = arr[front];

	        front = (front + 1) % size;

	        count--;

	        return data;
	    }

	    int peek() {

	        if (count == 0) {
	            return -1;
	        }

	        return arr[front];
	    }

	    boolean isEmpty() {
	        return count == 0;
	    }
	}