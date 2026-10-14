
public class InsertionSort {
	
	static void  insertionSort(int arr[],int n){

	    for(int i =1; i < n; i++){
	        int temp = arr[i];
	        int j = i-1;

	        while(j>=0)
	        {
	            if(arr[j]>temp){
	                arr[j+1] = arr[j];
	                j--;        
	            }
	            else{
	                break;
	            }
	        }
	        arr[j+1] = temp; 
	    }   
	}
		public static void main(String[] args) {
				
				int arr[] = {5,3,8,1,6,10,4};
				int n = arr.length;
				for(int i : arr)
					System.out.print(i + " ");
				
				insertionSort(arr,n);
				System.out.println();
				
				for(int i : arr)
					System.out.print(i + " ");
		
			}
}
