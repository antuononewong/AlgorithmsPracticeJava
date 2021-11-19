/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. 
 * The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. 
 * 
 * There are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 */

public class RomanToInt {
	
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("XL"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("CD"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	private static int romanToInt(String s) {
		int strIndex = 0;
		int number = 0;
		
		while (strIndex < s.length()) {
			
			char c = s.charAt(strIndex);
			
			switch (c) {
				case 'I':
					if (strIndex != s.length() - 1) {
						char next = s.charAt(strIndex + 1);
						if (next == 'V') {
							number += 4;
							strIndex += 1;
						}
						else if (next == 'X') {
							number += 9;
							strIndex += 1;
						}
						else {
						number += 1;
						}
					}
					break;
				case 'V':
					number += 5;
					break;
				case 'X':
					if (strIndex != s.length() - 1) {
						char next = s.charAt(strIndex + 1);
						if (next == 'L') {
							number += 40;
							strIndex += 1;
						}
						else if (next == 'C') {
							number += 90;
							strIndex += 1;
						}
						else {
						number += 10;
						}
					}
					break;
				case 'L':
					number += 50;
					break;
				case 'C':
					if (strIndex != s.length() - 1) {
						char next = s.charAt(strIndex + 1);
						if (next == 'D') {
							number += 400;
							strIndex += 1;
						}
						else if (next == 'M') {
							number += 900;
							strIndex += 1;
						}
						else {
						number += 100;
						}
					}
					break;
				case 'D':
					number += 500;
					break;
				case 'M':
					number += 1000;
					break;
			}
			strIndex += 1;
		}
		
		return number;
	}
	
}
