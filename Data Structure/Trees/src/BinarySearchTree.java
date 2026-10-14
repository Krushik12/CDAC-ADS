/*A Binary Search Tree is a binary tree with an ordering rule:

left subtree < root < right subtree*/


public class BinarySearchTree {
	class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data = data;
		}
	}
	Node root;
	
	// Insertion  in the BST
	
	void insert(int value) {
		root = insertRecursive(root,value);
	}
	
	Node insertRecursive(Node root , int value) {
		
		//Empty position
		if(root == null) {
			return new Node(value);
		}
		
		if(value < root.data) {
			root.left = insertRecursive(root.left,value);
		}
		else if(value > root.data) {
			root.right = insertRecursive(root.right,value);
		}
		else {
			System.out.println("Duplicates value ");
			
		}
		return root;
	}
	
	// Search in BST
	
	boolean search(int key) {
		return searchRecursive(root,key);
	}
	
	boolean searchRecursive(Node root, int key) {
		if(root == null) {
			return false;
		}
		if (root.data == key) {
            return true;
        }
		if(root.data > key) {
			return searchRecursive(root.left,key);
		} 
		return searchRecursive(root.right,key);
	}
	
	//Iterative search 
	boolean searchIterative(int key) {
		if(root == null) {
			return false;
		}
		Node temp = root;
		while( temp != null) {
			if(temp.data > key) {
				temp = temp.left;
			}
			else if (temp.data < key) {
				temp = temp.right;
			}
			else{
				return true;
			}
		}
		return false;
	}
	
	//Delete From BST
	
	public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
	        if (current == null) {
	            return null;
	        }
	        if (value < current.data) {
	            current.left = deleteRecursive(current.left, value);
	            return current;
	        }
	        if (value > current.data) {
	            current.right = deleteRecursive(current.right, value);
	            return current;
	        }
	        if (current.left == null && current.right == null) {
	            return null;
	        }
	        if (current.left == null) {
	            return current.right;
	        }
	        if (current.right == null) {
	            return current.left;
	        }

	        int successorValue = minValue(current.right);
	        current.data = successorValue;
	        current.right = deleteRecursive(current.right, successorValue);
	        return current;
    	}
    
    	int minValue(Node node) {
    		Node current = node;
    		while (current.left != null) {
    			current = current.left;
    		}
    		return current.data;
    	}
    	
    	int min() {
    		if (root == null) {
                throw new IllegalStateException("Tree is empty");
            }
    		Node current = root;
    		while(current.left != null) {
    			current = current.left;
    		}
    		return current.data;
    	}
    	int max() {
    		if (root == null) {
                throw new IllegalStateException("Tree is empty");
            }
    		Node current = root;
    		while(current.right != null) {
    			current = current.right;
    		}
    		return current.data;
    	}
    	
    	// height of BSt
    	int height() {
    		return heightRecursive(root);
    	}
    	
    	int heightRecursive(Node current) {
    		if (current == null) {
                return -1;
            }
    		int leftH = heightRecursive(current.left);
    		int rightH = heightRecursive(current.right);
    		int h = 1 + Math.max(leftH,rightH);
    		return h;
    		
    		//return 1 + Math.max(heightRecursive(current.left),heightRecursive(current.right));	
    	}
    	
    	//depth 
    	public int depth(int value) {
            Node current = root;
            int depth = 0;

            while (current != null) {
                if (value == current.data) {
                    return depth;
                }

                if (value < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
                depth++;
            }

            return -1;
    	}
    	
    	// Traversal 
    	
    	// 1. Preorder
    	void preorder() {
    		preorderRecursive(root);
            System.out.println();
    	}
    	void preorderRecursive(Node root) {
    		if(root == null) {
    			return ;
    		}
    		System.out.println(root.data);
    		preorderRecursive(root.left);
    		preorderRecursive(root.right);
    	}
    	
    	// 2. Inorder
    	void inOrder() {
    		inorderRecursive(root);
            System.out.println();
    	}
    	void inorderRecursive(Node root) {
    		if(root == null) {
    			return ;
    		}
    		inorderRecursive(root.left);
    		System.out.println(root.data);	
    		inorderRecursive(root.right);
    	}
    	
    	// 3. Postorder
    	void postOrder() {
    		postorderRecursive(root);
            System.out.println();
    	}
    	void postorderRecursive(Node root) {
    		if(root == null) {
    			return ;
    		}
    		postorderRecursive(root.left);	
    		postorderRecursive(root.right);
    		System.out.println(root.data);
    	}
    	
    	public static void main(String[] args) {
           BinarySearchTree tree = new BinarySearchTree();

            tree.insert(50); // root
            tree.insert(30);
            tree.insert(70);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(80);

            System.out.print("Inorder traversal: ");
            tree.inOrder();


            System.out.print("Preorder traversal: ");
            tree.preorder();

            System.out.print("Postorder traversal: ");
            tree.postOrder();

            int key = 40;
            System.out.println("Search " + key + ": " + tree.search(key));

            key = 90;
            System.out.println("Search " + key + ": " + tree.search(key));

            System.out.println("Minimum value: " + tree.min());
            System.out.println("Maximum value: " + tree.max());
            System.out.println("Tree height: " + tree.height());

            key = 60;
            System.out.println("Depth of " + key + ": " + tree.depth(key));

            key = 100;
            System.out.println("Depth of " + key + ": " + tree.depth(key));
        }
}
