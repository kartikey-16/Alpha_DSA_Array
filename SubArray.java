package Arrays;

public class SubArray {

	private static void subArray(int[] numbers) {
		for(int i = 0 ; i< numbers.length; i++)
		{
			int current = i;
			for(int j = i ; j< numbers.length; j++)
			{
				int next = j;
				for(int k = current  ; k <= next; k++)
				{
					System.out.print(numbers[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[])
	{	
		int numbers[] = {5,9,14,18,20,23};
		subArray(numbers);
		
	}

}
