import java.util.Arrays;

public class IntArrayPlusOne {
	
	public static int[] plusOne(int[] digits) {
		if (digits.length == 0) {
			return null;
		}
		
		int i = digits.length - 1;
		
		while (digits[i] == 9 && i > 0) {
			digits[i] = 0;
			i -= 1;
		}
		if (digits[0] == 9 && digits.length == 1) {
			int[] carry = {1, 0};
			return carry;
		}
		
		if (digits[0] == 9) {
			digits[i] = 0;
			int[] carry = new int[digits.length + 1];
			carry[0] = 1;
			
			for (int j = 1; j < digits.length; j++) {
				carry[2 + i] = digits[i];
			}
			
			return carry;
		}
		else {
			digits[i] += 1;
			return digits;
		}
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		int[] nums1 = {9};
		int[] nums2 = {9, 9, 9, 9};
		int[] nums3 = {4};
		int[] nums4 = {};
		
		System.out.println(Arrays.toString(plusOne(nums)));
		System.out.println(Arrays.toString(plusOne(nums1)));
		System.out.println(Arrays.toString(plusOne(nums2)));
		System.out.println(Arrays.toString(plusOne(nums3)));
		System.out.println(Arrays.toString(plusOne(nums4)));
	}
}
