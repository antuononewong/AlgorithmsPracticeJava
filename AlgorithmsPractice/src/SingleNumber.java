
public class SingleNumber {
	public static int singleNumber(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int unique = 0;
		for (int i = 0; i < nums.length; i++) {
			unique ^= nums[i];
		}
		return unique;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 2, 20, 3, 3};
		System.out.println(singleNumber(nums));
	}
}

/* 2 1 2
 * uni 2
 * i 4
 * have to walk through each element once, could use hashmap to eliminate duplicates
 * O(n) time, O(1) space
 * unique set to first number, iterate through the array
 * if unique is equal to the next, set unique to the next next number, continue til we compare to nums.length - 2
 * unique will be the unique number
 */