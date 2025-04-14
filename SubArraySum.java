package Arrays;
//*****************************   Max-SubArray Sum ( Brute Force )  *******************
public class SubArraySum {
	static int currSum = 0;
	static int maxSum = Integer.MIN_VALUE;
	
	private static void subArray(int[] numbers) {
		for(int i = 0 ; i< numbers.length; i++)
		{
			int current = i;
			for(int j = i ; j< numbers.length; j++)
			{
				int next = j;
				for(int k = current  ; k <= next; k++)
				{
					currSum = currSum + numbers[k];					
				}
				System.out.println(currSum);
				if(maxSum < currSum)
				{
					maxSum = currSum;
				}
			}
		}
		
		System.out.print("max Sum is : "+maxSum);
	}
	
	public static void main(String args[])
	{	
		int numbers[] = {5,9,4,18,2,3};
		subArray(numbers);
		
	}

}
