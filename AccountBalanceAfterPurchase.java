package in.leetcode;

public class AccountBalanceAfterPurchase {


	private static int accountBalanceAfterPurchase(int purchaseAmount) {
		// TODO Auto-generated method stub
		int rem = purchaseAmount % 10;
		int balance = 10 - rem;
		if(rem < 5)
			purchaseAmount -= rem;
		else
			purchaseAmount += balance;
		
		return 100 - purchaseAmount;
		
	}

	
	public static void main(String[] args) {
		
		int purchaseAmount = 8;
		System.out.println(accountBalanceAfterPurchase(purchaseAmount));;
	}
}
  