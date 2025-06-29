package in.leetcode;

public class DivisibleAndNonDivisibleSemsDiff {
	
	private static int differenceOfSums(int num1, int num2) {
		// TODO Auto-generated method stub
		
		int sum1 = 0 , sum2 = 0;
		for(int i = 1 ;  i <= num1 ; i++)
		{
			if(i % num2 != 0)
				sum1 += i;
			else
				sum2 += i;
		}
		return (sum1 - sum2);
		
	}
	
	public static void main(String[] args) {
		int num1 = 10 , num2 = 3;
		System.out.println(differenceOfSums(num1,num2));;
	}

}
