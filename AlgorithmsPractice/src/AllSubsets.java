import java.util.ArrayList;

public class AllSubsets {
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] nums) {
	    ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();

	    for (int i = 0; i < nums.length; i++) {
	        ArrayList<Integer> subset = new ArrayList<Integer>();
	        subset.add(nums[i]);
	        subsets.add(subset);
	        addToSubset(nums, i+1, subsets, subset);
	    }

	    subsets.add(new ArrayList<Integer>()); //account for empty subset

	    return subsets;
	}

	public static void addToSubset(int[] nums, int index, ArrayList<ArrayList<Integer>> subsets,   
	                         ArrayList<Integer> subset) {
		if (index > nums.length)
			return;
		
	    for (int i = index; i < nums.length; i++) {
	    	ArrayList<Integer> newSubset = new ArrayList<Integer>();
	    	newSubset.addAll(subset);
	        newSubset.add(nums[i]);
	        subsets.add(newSubset);
	        addToSubset(nums, i+1, subsets, newSubset);
	    }
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 7};
		
		ArrayList<ArrayList<Integer>> subsets = getSubsets(nums);
		System.out.println(subsets.toString());
		System.out.println(subsets.size());
	}


}
