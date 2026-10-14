public class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at first
    void insertFirst(int value) {

        Node newNode = new Node(value);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        head = newNode;

        temp.next = head;
    }

    // Insert at last
    void insertLast(int value) {

        Node newNode = new Node(value);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Insert after a given value
    void insertAfter(int key, int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            if (temp.data == key) {

                Node newNode = new Node(value);

                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println(key + " not found");
    }

    // Delete first
    void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head;
    }

    // Delete last
    void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    // Delete a given value
    void delete(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete head
        if (head.data == value) {
            deleteFirst();
            return;
        }

        Node temp = head;

        while (temp.next != head) {

            if (temp.next.data == value) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }

        System.out.println(value + " not found");
    }

    // Search
    void search(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {

            if (temp.data == value) {
                System.out.println(value + " found");
                return;
            }

            temp = temp.next;

        } while (temp != head);

        System.out.println(value + " not found");
    }

    // Display
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        list.display();

        list.insertFirst(5);
        list.display();

        list.insertAfter(20, 25);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(20);
        list.display();

        list.search(25);
        list.search(100);
    }
}