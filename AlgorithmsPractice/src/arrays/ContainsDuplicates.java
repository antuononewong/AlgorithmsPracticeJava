package arrays;
import java.util.HashMap;

public class ContainsDuplicates {
	public static boolean containsDups(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i : nums) {
			boolean exists = (map.put(i, true) == null) ? false : true;
			if (exists)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		System.out.println(containsDups(nums));
	}
}
