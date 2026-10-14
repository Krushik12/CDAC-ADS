
public class BubbleSort {
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] =arr[j];
					arr[j] = t;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5,3,8,1,6,10,4};
		for(int i : arr)
			System.out.print(i + " ");
		
		bubbleSort(arr);
		System.out.println();
		
		for(int i : arr)
			System.out.print(i + " ");

	}

}
