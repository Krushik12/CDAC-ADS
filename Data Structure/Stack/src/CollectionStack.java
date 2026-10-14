import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		//Built in Java collection
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.peek()); // 30
		System.out.println(stack.pop());  // 30
		System.out.println(stack.pop());  // 20
		
		

	}

}
