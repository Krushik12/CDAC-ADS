

public class DoublyLinkedList {

	
		// TODO Auto-generated method stub
		class Node{
			int data;
			Node next;
			Node prev;
			
			Node(int data){
				this.data = data;
				this.next = null;
				this.prev = null;
			}
		}
		Node head;
		
		
		void insertFirst(int value){
			
			Node newNode = new Node(value);
			
			 if (head == null) {
			        head = newNode;
			        return;
			    }
			 
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		void insertAfter(int key, int value) {
		    Node temp = head;

		    while (temp != null) {

		        if (temp.data == key) {

		            Node newNode = new Node(value);

		            // If key is the last node
		            if (temp.next == null) {
		                temp.next = newNode;
		                newNode.prev = temp;
		                return;
		            }

		            newNode.next = temp.next;
		            newNode.prev = temp;

		            temp.next.prev = newNode;
		            temp.next = newNode;

		            return;
		        }

		        temp = temp.next;
		    }

		    System.out.println(key + " not found");
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
			newNode.prev = temp;
		}
		
		void deleteFirst(){
			if(head == null) {
				System.out.println("List is empty");
	            return;
			}
			if (head.next == null) {
		        head = null;
		        return;
		    }
			head = head.next;
			head.prev = null;
			
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
	        temp.next.prev = null;
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
		
		void delete(int value) {
		    if (head == null) {
		        System.out.println("List is empty");
		        return;
		    }

		    Node temp = head;

		    while (temp != null) {

		        if (temp.data == value) {

		            // deleting first node
		            if (temp == head) {
		                deleteFirst();
		                return;
		            }

		            // deleting last node
		            if (temp.next == null) {
		                deleteLast();
		                return;
		            }

		            // deleting middle node
		            temp.prev.next = temp.next;
		            temp.next.prev = temp.prev;

		            return;
		        }

		        temp = temp.next;
		    }

		    System.out.println(value + " not found");
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
		DoublyLinkedList list = new DoublyLinkedList();

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
