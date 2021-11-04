import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] nums) {
		int[] helper = new int[nums.length];
		mergeSort(nums, helper, 0, nums.length - 1);
	}
	
	public static void mergeSort(int[] nums, int[] helper, int start, int end) {
		if (start < end) {
			int midpoint = start + (end - start) / 2;
			mergeSort(nums, helper, start, midpoint);
			mergeSort(nums, helper, midpoint+1, end);
			merge(nums, helper, start, midpoint, end);
		}
	}
	
	public static void merge(int[] nums, int[] helper, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			helper[i] = nums[i];
		}
		
		int leftHalf = start;
		int rightHalf = mid+1;
		int current = start;
		
		while (leftHalf <= mid && rightHalf <= end) {
			if (helper[leftHalf] <= helper[rightHalf]) {
				nums[current] = helper[leftHalf];
				leftHalf += 1;
			}
			else {
				nums[current] = helper[rightHalf];
				rightHalf += 1;
			}
			current += 1;
		}
		
		int remainder = mid - leftHalf;
		for (int i = 0; i <= remainder; i++) {
			nums[current+i] = helper[leftHalf+i];
		}
		
	}
	public static void main(String[] args) {
		int[] nums = {12, 1, 6, 4, 20, 14};
		mergeSort(nums);
		System.out.println(Arrays.toString(nums));
	}

}
