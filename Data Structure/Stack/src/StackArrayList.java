
import java.util.ArrayList;

class StackArrayList<T> {

    private ArrayList<T> list = new ArrayList<>();

    void push(T value) {
        list.add(value);
    }

    T pop() {
        if (list.isEmpty())
            throw new RuntimeException("Stack is empty");

        return list.remove(list.size() - 1);
    }

    T peek() {
        if (list.isEmpty())
            throw new RuntimeException("Stack is empty");

        return list.get(list.size() - 1);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }
}








