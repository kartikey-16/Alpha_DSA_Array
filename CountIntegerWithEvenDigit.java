package in.leetcode;

public class CountIntegerWithEvenDigit {


	private static int countEven(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i= 1 ; i <= num ; i++)
		{
			if(sumOfDigits(i) % 2 == 0)
				//System.out.print(i+" ");
				count++;
		}
		return count;
		
	}
	private static int sumOfDigits(int n)
	{
		int sum = 0 ;
		while(n != 0)
		{
			int digit = n % 10;
			sum += digit;
			n= n /10;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		int num = 30;
		System.out.println(countEven(num));
	}
}
