

import java.util.ArrayList;
import java.util.Scanner;

public class StudentQueue {
	private ArrayList<Integer> queue = new ArrayList<>();
	
	//Add student in queue
	void enqueue(int studentId) {
		queue.add(studentId);
		System.out.println("Student " + studentId + " added to queue.");
	}
	
	//Remove student from queue
	void dequeue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
			
		}
		int id =  queue.remove(0);
		System.out.println("Student " + id + " removed  from queue.");
	}
	
	//Display the queue
	void display() {
		if(queue.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
			
		}
		System.out.println(queue);
	}
	
	//Search student
	void search(int studentId) {
		if (queue.contains(studentId)) {
            System.out.println("Student " + studentId + " is waiting.");
        } else {
            System.out.println("Student " + studentId + " is not waiting.");
        }
	}
	
	//count students
	 void count() {
	        System.out.println("Current number of students: " + queue.size());
	    }
	
	
	
	public static void main(String[] args) {
		StudentQueue sq = new StudentQueue();
		  Scanner sc = new Scanner(System.in);
		
		sq.enqueue(105);
		sq.enqueue(112);
        sq.enqueue(108);
        sq.enqueue(101);
        sq.enqueue(115);

        sq.display();

        // Remove front student
        sq.dequeue();

        sq.display();

        // Search
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        sq.search(id);

        // Count
        sq.count();

        sc.close();
	}

}
