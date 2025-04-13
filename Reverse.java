package Arrays;

public class Reverse {
	private static void reverseArray(int[] numbers) {
		// TODO Auto-generated method stub
		int left = 0 ;
		int right = numbers.length - 1;
		
		while(left < right)
		{
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left ++;
			right--;
		}
	}

	public static void main(String args[])
	{
		int numbers[] = {5,9,14,18,20,23,28,33,39,40,45};
		reverseArray(numbers);
		for(int i = 0 ; i< numbers.length ; i++)
		{
			System.out.print(numbers[i]+" ");			
		}
	}

	
}
