
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		if (s.equals(""))
			return false;
		
		int start = 0;
		int end = s.length() - 1;
		
		while (start < end) {
			while(!Character.isLetter(s.charAt(start)) && start < s.length() - 1) 
				start += 1;
			while(!Character.isLetter(s.charAt(end)) && end > 0) 
				end -= 1;
			char startChar = Character.toLowerCase(s.charAt(start));
			char endChar = Character.toLowerCase(s.charAt(end));
				
			if (startChar != endChar) 
				return false;
			start += 1;
			end -= 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome(";/"));
	}

}


/* assume, no numbers and case doesn't matter
 * pointer to start and pointer to end
 * compare outside in, if the pointers cross, we have a palindrome
 * even if odd or even string, comparing the center char or center 2 chars will work out
 * if we see a space can increment that side
 * O (n / 2)
 * 
 * A race fcar a
 * start r
 * end r
 */
