
public class BinarySearch {
	
	public static int binarySearchIterative(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		if (nums.length == 1)
			return (nums[0] == target) ? 0 : -1;
		
		int start = 0;
		int end = nums.length - 1;
		
		while (start < end) {
			int midpoint = end + start / 2;
			int midpointValue = nums[midpoint];
			
			if (midpointValue == target)
				return midpoint;
			
			if (midpointValue > target) {
				end = midpoint - 1;
			}
			else {
				start = midpoint + 1;
			}
				
		}
		return (nums[start] == target) ? start : -1;
	}
	
	public static int binarySearchRecursive(int[] nums, int target, int start, int end) {
		if (nums.length == 0)
			return -1;
		if (nums.length == 1)
			return (nums[0] == target) ? 0 : -1;
		if (end - start < 0)
			return -1;
		
		int midpoint = end + start / 2;
		int midpointValue = nums[midpoint];
		
		if (midpointValue == target) 
			return midpoint;
		else if (nums[start] == target)
			return start;
		else if  (nums[end] == target)
			return end;
		
		if (midpointValue > target) 
			end = midpoint - 1;
		else 
			start = midpoint + 1;
		
		return binarySearchRecursive(nums, target, start, end);
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 7, 15, 24, 36};
		int[] nums2 = {};
		int[] nums3 = {45, 50};
		int[] nums4 = {1, 66, 80, 120, 170, 350, 999, 1200, 2311, 3200};
		
		System.out.println(binarySearchIterative(nums1, 7));
		System.out.println(binarySearchIterative(nums2, 100));
		System.out.println(binarySearchIterative(nums3, 50));
		System.out.println(binarySearchIterative(nums3, 0));
		System.out.println(binarySearchIterative(nums4, 2311));
		System.out.println();
		System.out.println(binarySearchRecursive(nums1, 7, 0, nums1.length - 1));
		System.out.println(binarySearchRecursive(nums2, 100, 0, nums2.length - 1));
		System.out.println(binarySearchRecursive(nums3, 50, 0, nums3.length - 1));
		System.out.println(binarySearchRecursive(nums3, 0, 0, nums3.length - 1));
		System.out.println(binarySearchRecursive(nums4, 1, 0, nums4.length - 1));
	}

}
