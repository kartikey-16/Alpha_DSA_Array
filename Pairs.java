package Arrays;

public class Pairs {

	private static void pairOfArray(int[] numbers) {
		for(int i = 0 ; i< numbers.length; i++)
		{
			int current = numbers[i];
			for(int j = i+1 ; j< numbers.length; j++)
			{
				System.out.print("( " + current + "," + numbers[j]+" )  ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[])
	{	
		int numbers[] = {5,9,14,18,20,23,28,33,39,40,45};
		pairOfArray(numbers);
		for(int i = 0 ; i< numbers.length ; i++)
		{
			System.out.print(numbers[i]+" ");			
		}
	}

}
