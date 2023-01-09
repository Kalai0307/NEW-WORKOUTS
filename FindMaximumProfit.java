package com.practice.patterns;

public class FindMaximumProfit {

	public static void main(String[] args) {

	//	int prices[] = { 7, 1, 5, 3, 6, 4 };
		//int prices[] = { 7, 6,4,3,1 };
		int prices[] = { 7,4,3,1,8,10};
		int lowestofAll = prices[0];
		int index = 0;
		for (int i = 1; i < prices.length; i++) {
			if (lowestofAll > prices[i]) {
				lowestofAll = prices[i  ];
				index = i;

			}
		}
		//System.out.println("index   "+ index);
		int maxProfit = findmaxProfit(lowestofAll, index, prices);
		System.out.println("max profit:   " + maxProfit);

	}

	private static int findmaxProfit(int lowestofAll, int index, int[] prices) {

		int maxprofit = 0;
		int price = 0;
		boolean flag=false;
		for (int i = index + 1; i < prices.length; i++) {
			if (price < prices[i]) {
				price = prices[i];
				flag=true;
			}
		}
		//System.out.println(price);
		if(flag==false)
		{
			return 0;
		}
		else
		{
			maxprofit=price-prices[index];
			return maxprofit;
		}
	
		
		//return price - prices[index];
	}

}
