package arrays;
import java.util.Arrays;

public class DuplicateZeroes {
	
	public static void duplicateZeroes(int[] arr) {
        if (arr.length < 0)
            return;
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                	arr[j] = arr[j-1];
                }
                i+=1;
            }
            i+=1;
        }
    }

	    public static void duplicateZeroes2(int[] arr) {
	    	if (arr.length < 0)
	    		return;
	        int i = 1;
	        int previous = arr[0];
	        
	        while(i < arr.length - 1) {
	            if (previous == 0) {
	                previous = arr[i];
	                arr[i] = 0;
	                i+=1;
	                while (previous != 0 && i < arr.length - 1) {
	                    int temp = previous;
	                    previous = arr[i];
	                    arr[i] = temp;
	                    i+=1;
	                }
	                
	            }
	            else    
	                previous = arr[i];
	                i+=1;
	        }
	    }
	    
	    public void swap(int[] arr, int i, int previousValue) {
	    	int temp = arr[i];
	    	arr[i] = previousValue;
	    	previousValue = temp;
	    }

	
	
	public static void main(String[] args) {
		int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
		duplicateZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

}
