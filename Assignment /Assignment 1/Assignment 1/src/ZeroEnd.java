import java.util.Arrays;

public class ZeroEnd {

    public static void main(String[] args) {

       // int[] arr = {0, 5, 0, 3, 8, 0, 2};
        int[] arr = {4,0,5,0,2,7};

        int position = 0;

      
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        
        while (position < arr.length) {
            arr[position] = 0;
            position++;
        }

        System.out.println(Arrays.toString(arr));
    }
}