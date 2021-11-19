package mathBased;
/*
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInt {
	
	public static void main(String[] args) {
		System.out.println(reverseInt(123));
		System.out.println(reverseInt(-123));
		System.out.println(reverseInt(120));
		System.out.println(reverseInt(0));
		System.out.println(reverseInt(-2147483648));
	}
	
	public static int reverseInt(int x) {
		int reverse = 0;
		boolean negative = false;
		
		if (Integer.signum(x) < 0) {
			x *= -1;
			negative = true;
		}
		
		while (x > 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10; // Java rounds down on integer division
		}
		
		if (reverse < Math.pow(-2, 31) || reverse > Math.pow(2, 31) - 1) {
			return 0;
		}
		
		if (negative) {
			reverse *= -1;
		}
		
		return reverse;
	}
}
