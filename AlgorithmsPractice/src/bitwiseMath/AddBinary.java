import java.util.Arrays;
import java.util.HashSet;

public class AddBinary {
	
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		
		while (i >= 0 || j >= 0) {
			int aValue = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
			int bValue = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;
			int sum = aValue + bValue + carry; 
			
			switch(sum) {
				case 0:
					sb.append("0");
					carry = 0; 
					break;
				case 1:
					sb.append("1");
					carry = 0;
					break;
				case 2:
					sb.append("0");
					carry = 1;
					break;
				case 3:
					sb.append("1");
					carry = 1;
					break;
			}
			i-=1;
			j-=1;
		}
	
		return sb.reverse().toString();
	}
	
	public static boolean checkPermutation(String str) {
	    if (str.length() < 0)
	        return true;

	    HashSet<Character> set = new HashSet<Character>();
	        
	    for (char c : str.toCharArray()) {
	        if (set.contains(c))
	            set.remove(c);
	        else
	            set.add(c);
	    }
	    
	    System.out.println(set.toString());
	    
	    return set.size() <= 1;
	}


	
	public static void main (String[] args) {
		String a = "1011"; //1101
		String b =   "10";
		
		String str = "how  doo  are";
		String perm = "tacocatkk";
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.stream().forEach(i->System.out.println(i));
		
		//System.out.println(checkPermutation(perm));
		//System.out.println(addBinary(a, b));
		//System.out.println(Arrays.toString(str.split(" ")));
	}
}

/*
 * Runtime wise it is linear time based on the longest binary sequence since we'll have to compare each column regardless if there's a second or 3rd digit
 * Need some sort of pointer or data structure to compare each column from right to left
 * Need some variable to store a carry in the case of 1 + 1
 * Need to handle adding the the rest of the columns if one string is longer than the other
 * How do we "add" the columns
 */

