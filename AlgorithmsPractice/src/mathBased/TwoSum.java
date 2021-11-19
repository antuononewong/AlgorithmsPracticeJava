
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) { 

		if (numbers.length < 0) 
			return null; 

		int[] sumArray = new int[2]; 
		int start = 1; 
		int end = numbers.length; 

		while (start < end) { 

			int sum = numbers[start] + numbers[end]; 

			if (sum == target) { 

				sumArray[0] = start; 
				sumArray[1] = end; 
				break; 
			} 

			if (sum > target) 
				end -= 1; 
			else 
				start += 1; 
		} 

		return sumArray; 
	} 
}

/*
 * 20
 * 4 1 5
 * 5 25 
 * 4 25 29
 * 4 81 85
 * 64 25 89
 * 64 81 145
 * 25 16 1 42
 * 16 4 20
 * 
 * 8
 * 8 64
 * 36 16 52
 * 25 4 29
 * 4 81 85
 * 64 25 89
 * 64 81 145
 * 25 16 1 42
 * 16 4 20
 * 
 * 12
 * 1 4 5
 * 25
 * 
 * 11
 * 1 1 2
 * 2 4
 * 16
 * 1 36 37
 * 9 49 58
 * 25 64 89
 * 
 * 10
 * 1 1 2
 * 4
 * 
 * 13
 * 1 9 10
 * 
 * 14
 * 1 16 17
 * 1 49 50
 * 25 1 26
 * 4 36 40
 * 16 1 17
 * 
 * 15
 * 1 25 26
 * 4 36 40
 * 16 1 17
 * 
 * 16 
 * 1 36 37
 * 9 49 58
 * 
 * 17
 * 1 49 50
 * 
 * 18
 * 1 64 65
 * 36 25 51
 * 25 1 26
 * 4 16 20
 * 
 * 1
 * 
 * 2
 * 
 * 3
 * 9
 * 81
 * 1 81 82
 * 
 * 4
 * 16
 * 
 * 5
 * 25
 * 4 25 29
 * 4 81 85
 * 81 25 106
 * 1 1 36 38
 * 9 81 90
 * 81 1 82
 * 64 4 68
 * 36 81 117
 * 1 1 49 51
 * 
 * 6
 */
