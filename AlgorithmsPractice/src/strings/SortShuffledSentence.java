package strings;
/*
 * Sorting the sentence
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 * "is2 sentence4 This1 a3" = “This is a sentence”
 * 
 * Iterate through string. Build a string until we see a number then skip an index to account for the space and 
 * map the built string to a String[9] arr utilizing the number we find. Iterate through
 * 
 * O(N + M) time O(len(word) + max word count) space

 */
public class SortShuffledSentence {
	
	public static String sortSentence(String shuffled) {
	    if (shuffled.equals("") || shuffled.equals(" "))
	        return null;
	    
	    StringBuilder sb = new StringBuilder();
	    String[] original = new String[9];
	    int i = 0;
	    
	    while (i < shuffled.length()) {
	        while(Character.isLetter(shuffled.charAt(i))) { // Need to adjust if we have special characters like commas or other punctuation
	            sb.append(shuffled.charAt(i));
	            i += 1;
	        }
	        int position = Character.getNumericValue(shuffled.charAt(i));
	        
	        if (position < 0)
	        	throw new NumberFormatException("Class SortShuffledSentence Method sortSetence: Invalid string input.");
	        
	        original[position - 1] = sb.toString();
	        sb.setLength(0); // resets stringbuilder to handle next word
	        i += 2; // number plus a space
	    }
	    
	    i=0;
	    while (i < original.length) {
	        if (original[i] == null)
	            break;
	        sb.append(original[i] + " ");
	        i += 1;
	    }
	    sb.setLength(sb.length() - 1); // get rid of trailing space
	    return sb.toString();
	}

	public static void main(String[] args) {
		String shuffled = "is2 sentence5 This1 a3 shuffled4";
			
		System.out.println(sortSentence(shuffled));
	}
}
