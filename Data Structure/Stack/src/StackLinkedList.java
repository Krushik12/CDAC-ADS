
import java.util.LinkedList;

class StackLinkedList<T> {

    private LinkedList<T> list = new LinkedList<>();

    void push(T value) {
        list.addFirst(value);
    }

    T pop() {
        if (list.isEmpty())
            throw new RuntimeException("Stack is empty");

        return list.removeFirst();
    }

    T peek() {
        if (list.isEmpty())
            throw new RuntimeException("Stack is empty");

        return list.getFirst();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }
}