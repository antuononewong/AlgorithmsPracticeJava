
public class ClimbingStairs {
	
	public static int climbStairs(int n) {
		if (n <= 0)
			return n;
		
		int firstStep = 1;
		int secondStep = 2;
		int total = 0; 
		
		for (int i = 3; i <= n; i++) {
			total = firstStep + secondStep;
			firstStep = secondStep;
			secondStep = total;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
	
	/*
	1 1
	2 2
	3 3
	4 5
	5 8
	
	1 1 1 1 1
	1 1 1 2
	1 1 2 1
	1 2 1 1
	2 1 1 1
	1 2 2
	2 1 2
	2 2 1
	*/
}
