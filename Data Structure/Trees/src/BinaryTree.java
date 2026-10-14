

//A Binary Tree is a tree data structure in which each node can have at most two children:
public class BinaryTree {

    // Node class
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    // Inorder: Left -> Root -> Right
    void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder: Root -> Left -> Right
    void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left -> Right -> Root
    void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Creating root
        tree.root = tree.new Node(10);

        // Creating children
        tree.root.left = tree.new Node(20);
        tree.root.right = tree.new Node(30);

        tree.root.left.left = tree.new Node(40);
        tree.root.left.right = tree.new Node(50);

        tree.root.right.left = tree.new Node(60);
        tree.root.right.right = tree.new Node(70);

        /*
                 10
               /    \
             20      30
            /  \    /  \
           40  50  60  70
        */

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        
    }
}