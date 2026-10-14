

//Every level is completely filled except possibly the last level.
//The last level is filled from left to right.

/*           1
         /   \
        2     3
       / \   /
      4   5 6
*/ 

public class CompleteBinaryTree {

    int[] tree;
    int size;

    CompleteBinaryTree(int capacity) {
        tree = new int[capacity];
        size = 0;
    }

    // Insert
    void insert(int value) {

        if (size == tree.length) {
            System.out.println("Tree is full");
            return;
        }

        tree[size] = value;
        size++;
    }

    // Display
    void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }

        System.out.println();
    }

    // Get parent
    int parent(int index) {

        if (index == 0) {
            return -1;
        }

        return tree[(index - 1) / 2];
    }

    // Get left child
    int leftChild(int index) {

        int leftIndex = 2 * index + 1;

        if (leftIndex >= size) {
            return -1;
        }

        return tree[leftIndex];
    }

    // Get right child
    int rightChild(int index) {

        int rightIndex = 2 * index + 2;

        if (rightIndex >= size) {
            return -1;
        }

        return tree[rightIndex];
    }

    public static void main(String[] args) {

        CompleteBinaryTree tree = new CompleteBinaryTree(10);

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        tree.display();

        System.out.println("Parent of 5: " + tree.parent(4));
        System.out.println("Left child of 2: " + tree.leftChild(1));
        System.out.println("Right child of 2: " + tree.rightChild(1));
    }
}
