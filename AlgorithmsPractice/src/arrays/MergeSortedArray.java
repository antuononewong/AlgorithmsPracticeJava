package arrays;
import java.util.Arrays;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0 || n == 0)
			return;
		
		int i = 0; //nums1
		int j = 0; //nums2
		
		while (i < m) {
			if (nums2[j] < nums1[i]) {
				swap(nums1, i, nums2, j);
			}
				
			i+=1;
		}
		
		if (nums2[j] > nums2[j+1])
			swap(nums2, j, nums2, j+1);
		
		while (j < n) {
			nums1[i] = nums2[j];
			i += 1;
			j += 1;
		}
	}
	
	public static void swap(int[] nums1, int i, int[] nums2, int j) {
		int temp = nums1[i];
		nums1[i] = nums2[j];
		nums2[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
		int[] nums2 = {1, 3, 7, 8};
		merge(nums1, 4, nums2, 4);
		System.out.println(Arrays.toString(nums1));
		
	}
}

/*
 * 1, 2 ,3 ,4, _ _ _
 * 1, 3, 7, 8
 * 
 * 1 1 2 3, 3, 4, 7 8
 * 3 4 7 8
 * index for array1, index for array2
 * compare a[i] to b[i]
 * if a is smaller, leave it there, increment a index
 * if b is smaller, swap a to b and b to a and increment a
 * if we reach the end of a, increment b to add the rest of the values in
 * subtract m - n to get size of m, once we reach end of m we do the same swap method with the rest of b, increment b
 */
