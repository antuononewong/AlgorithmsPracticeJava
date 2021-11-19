package arrays;

public class BuySellStock {
	public static int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;
		
		int min = prices[0];
		int profit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			int price = prices[i];
			
			if (min > price)
				min = price;
			else if (prices[i] - min > profit)
				profit = prices[i] - min;
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		int[] prices = {5, 2, 3, 12, 1};
		System.out.println(maxProfit(prices));
	}
}

/*
 * [5 2 1 20 3]
 * min 1
 * max 20
 * 
 * 7,1,5,3,6,4
 * min 1
 * max 6
 * find max, find min, do a single pass
 * we want to buy at the lowest price, sell at the highest price
 * compare buying at lowest value, selling at highest value
 * if buying cost more than selling, we return 0
 * 
 * [5 2 1 20 3]
 * min 1
 * max 20
 */
