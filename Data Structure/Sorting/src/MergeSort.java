
public class MergeSort {
	
	static void mergeSort(int[] arr, int low,int high) {
		if (low >= high)
            return;

        //int mid = (low + high) / 2; -- improper some times
		
        int mid = low + (high-low)/2; //3//1//0

        mergeSort(arr, low, mid); 
        
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
	}
	 static void merge(int[] arr, int low, int mid, int high) {

	        int[] temp = new int[high - low + 1];

	        int i = low;
	        int j = mid + 1;
	        int k = 0;

	        while (i <= mid && j <= high) {

	            if (arr[i] <= arr[j]) {
	                temp[k++] = arr[i++];
	            } else {
	                temp[k++] = arr[j++];
	            }
	        }

	        while (i <= mid) {
	            temp[k++] = arr[i++];
	        }

	        while (j <= high) {
	            temp[k++] = arr[j++];
	        }
	        
	        k=0;
	        for (i = low; i <= high; i++) {
	            arr[i] = temp[k++];
	        }
	    }
	 
		/*
		 * for (int i=0; i<merge.length;i++){ arr[l + i] = merge[i]; }
		 */
	 
	 
	public static void main(String[] args) {
		
		int arr[] = {5,3,8,1,6,10,4};
		int n = arr.length;
		for(int i : arr)
			System.out.print(i + " ");
		
		mergeSort(arr,0,n-1);
		
		System.out.println();
		
		for(int i : arr)
			System.out.print(i + " ");

	}
}
