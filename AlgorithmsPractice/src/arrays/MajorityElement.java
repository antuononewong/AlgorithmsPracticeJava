import java.util.Arrays;

public class MajorityElement {
		public static int majorityElement(int[] nums) {
			if (nums.length == 0)
				return -1;
			Arrays.sort(nums);
			
			int midpoint = nums.length / 2;
			
			return nums[midpoint];
		}
		
		public static void main(String[] args) {
			int[] nums = {2, 2, 1, 1, 1, 2, 2};
			System.out.println(majorityElement(nums));
		}
}

/*
 * 1 1 1 2 2 2 2
 */
