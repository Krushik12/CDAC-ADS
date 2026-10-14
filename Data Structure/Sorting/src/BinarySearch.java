class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data = data;
		}
	}
public class BinarySearch {
	Node root;
	
	boolean search(Node root, int key) {
		if(root== null) {
			return false;
		}
		
		if(root.data == key) {
			return true;
		}
		
		if(root.data < key) {
			return search(root.right,key);
		}
		
		return search(root.left,key);
		
	}

	public static void main(String[] args) {
		BinarySearch tree = new BinarySearch();
		
		tree.root = new Node(50);
	    tree.root.left = new Node(30);
	    tree.root.right = new Node(70);
	    tree.root.left.left = new Node(20);
	    tree.root.left.right = new Node(40);
	    tree.root.right.left = new Node(60);
	    tree.root.right.right = new Node(80);

	    int key = 100;

	    if (tree.search(tree.root, key)) {
	        System.out.println("Element found");
	    } else {
	        System.out.println("Element not found");
	    }
	}

}
