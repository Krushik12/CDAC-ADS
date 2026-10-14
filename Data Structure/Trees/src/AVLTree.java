
public class AVLTree {
	
	static class Node {									
		int data;
		int height;
		Node left;
		Node right;
		
		Node(int val){
			this.data = val;
			this.height = 1;
		}
	}	
		Node root;
		
		// Get height of a node
	    int height(Node node) {
	        if (node == null)
	            return 0;

	        return node.height;
	    }

	    // Get balance factor
	    int getBalance(Node node) {
	        if (node == null)
	            return 0;

	        return height(node.left) - height(node.right);
	    }

	    // Right Rotation
	    Node rightRotate(Node y) {

	        Node x = y.left;
	        Node T2 = x.right;

	        // Rotation
	        x.right = y;
	        y.left = T2;

	        // Update heights
	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        return x;
	    }

	    // Left Rotation
	    Node leftRotate(Node x) {

	        Node y = x.right;
	        Node T2 = y.left;

	        // Rotation
	        y.left = x;
	        x.right = T2;

	        // Update heights
	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        return y;
	    }
		
		//Insert a node
		void insert(int key) {
			root = insertRecursive(root, key);
		}
		Node insertRecursive(Node curr, int key) {
			
			//Empty
			if(curr == null) {
				return new Node(key);
			}
			if(curr.data < key)
				curr.right = insertRecursive(curr.right,key);
			else if(curr.data > key)
				curr.left = insertRecursive(curr.left,key);
			else
				return curr;
			
			//Check balance then makes it
			 
	        curr.height = Math.max(height(curr.left), height(curr.right)) + 1;


	        int balance = getBalance(curr);

	        // 4. LL Case
	        if (balance > 1 && key < curr.left.data)
	            return rightRotate(curr);

	        // 5. RR Case
	        if (balance < -1 && key > curr.right.data)
	            return leftRotate(curr);

	        // 6. LR Case
	        if (balance > 1 && key > curr.left.data) {
	            curr.left = leftRotate(curr.left);
	            return rightRotate(curr);
	        }

	        // 7. RL Case
	        if (balance < -1 && key < curr.right.data) {
	            curr.right = rightRotate(curr.right);
	            return leftRotate(curr);
	        }

	        return curr;
		}
		
		// Inorder traversal
	    void inorder(Node curr) {

	        if (curr != null) {

	            inorder(curr.left);

	            System.out.print(curr.data + " ");

	            inorder(curr.right);
	        }
	    }

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(35);

        tree.inorder(tree.root);

	}

}
