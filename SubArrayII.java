package Arrays;

//**************   Max-SubArray Sum ( Kadane's Algo = where you get negative it become zero )  ************


public class SubArrayII {

	static int currSum = 0;
	static int maxSum = Integer.MIN_VALUE;
	
	private static void subArraySum(int[] numbers) {
		for(int i = 0 ; i< numbers.length; i++)
		{
			currSum += numbers[i];
			if(currSum < 0)
			{
				currSum = 0;
			}
			if(maxSum < currSum )
			{
				maxSum = currSum ;
			}
		}
		
		System.out.print("max Sum is : "+maxSum);
	}
	
	public static void main(String args[])
	{	
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		subArraySum(numbers);
		
	}
}
