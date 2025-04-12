package Arrays;

public class Largest {

	private static int tolargest(int[] numbers) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < numbers.length; i++)
		{
			for(int j = i+1 ; j < numbers.length ; j++ )
			{
				if(numbers[i] > numbers[j])
				{
					largest = numbers[i];
				}
				
			}
		}
		return largest;
	}
	
	
	public static void main(String args[])
	{
		int numbers[] = {2,5,1,9,0,17,6};
		System.out.println(tolargest(numbers));
		
	}

	
	
}
