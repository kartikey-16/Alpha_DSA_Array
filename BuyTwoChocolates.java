package in.leetcode;

import java.util.Arrays;

public class BuyTwoChocolates {



	private static int buyChoco(int[] prices, int money) {
		// TODO Auto-generated method stub
		Arrays.sort(prices);
		int sum = prices[0] + prices[1];
		if(money - sum >= 0 )
			return (money-sum);
		else
			return money;
		
	}
	
	
	public static void main(String[] args) {
		int[] prices  =  {1,2,3};
		int money = 3;
		System.out.println(buyChoco(prices,money));;
	}
}
