import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		System.out.println("Enter the element :");
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();
		
		if(size<=0) {
			return;
		}
		
		int maxElement = arr[0];
		int miniElement = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<miniElement)
				miniElement = arr[i];
			if(arr[i]>maxElement)
				maxElement = arr[i];
		}
		
		System.out.println("Minimum Element is: "+ miniElement);
		System.out.println("Maximum Element is: "+ maxElement);
		
		
		sc.close();
		
	}

}
