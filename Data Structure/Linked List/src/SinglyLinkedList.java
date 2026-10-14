
public class SinglyLinkedList {

	
		// TODO Auto-generated method stub
		class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		Node head;
		
		void insertFirst(int value){
			
			Node newNode = new Node(value);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		void insertIndex(int key,int value){
				Node temp = head;	
				while(temp!=null) {
					if(temp.data == key) {
					Node newNode = new Node(value);
					newNode.next = head;
					head = newNode;
					}
				}
		}
		void insertLast(int value){
			
			Node newNode = new Node(value);
			if(head == null) {
				head = newNode;
				return;
			}
			
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		void deleteFirst(){
			if(head == null) {
				System.out.println("List is empty");
	            return;
			}
			head = head.next;
		}

		void deleteLast(){
			if(head == null) {
				System.out.println("List is empty");
	            return;
			}
			// Only one node
	        if (head.next == null) {
	            head = null;
	            return;
	        }

	        Node temp = head;

	        while (temp.next.next != null) {
	            temp = temp.next;
	        }

	        temp.next = null;
		}
		
		void search(int data) {
			Node temp = head;
			
			while(temp!= null) {
				if(temp.data == data) {
					System.out.println(data + " found");
	                return;
				}
				 temp = temp.next;
			}
			System.out.println(data + " not found");
		}
		
	    void display() {

	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node temp = head;

	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }

	        System.out.println("null");
	    }
		
		
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        list.display();

        list.insertFirst(5);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.search(20);
        list.search(100);
	}
}
