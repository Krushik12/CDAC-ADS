
public class SelectionSort {

	static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min = i ;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				int t = arr[min];
				arr[min] =arr[i];
				arr[i] = t;
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5,3,8,1,6,10,4};
		for(int i : arr)
			System.out.print(i + " ");
		
		selectionSort(arr);
		System.out.println();
		
		for(int i : arr)
			System.out.print(i + " ");

	}

}
