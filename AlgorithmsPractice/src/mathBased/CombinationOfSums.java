package mathBased;
import java.util.ArrayList;

public class CombinationOfSums {
	
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	
	
	public static void solve(int n) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		combo(n, nums);
		printArray();
	}
	
	
	public static void combo(int n, ArrayList<Integer> nums) {
		
		if (n <= 0) {
			ans.add(nums);
		}
		
		if (n > 0) {
			nums.add(-1);
			combo(n-1, nums);
		}
	}
	
	public static void printArray() {
		System.out.println(ans);
	}
	

	public static void main (String args[]) {
		
		CombinationOfSums.solve(4);
		CombinationOfSums.solve(1);
	}
}
