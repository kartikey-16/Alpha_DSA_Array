package Arrays;

public class BinarySearch {

	private static int binarySearch(int[] numbers, int key) {
		// TODO Auto-generated method stub
		int left = 0 ;
		int right = numbers.length - 1;
		
		for(int i = 0 ; i< numbers.length; i++)
		{
			int mid = (left + right) /2;
			if(numbers[mid] == key)
			{
				return mid;
			}
			if(numbers[mid] < key)
			{
				left = mid + 1;
			}
			else
				right = mid - 1;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int numbers[] = {5,9,14,18,20,23,28,33,39,40,45};
		int key = 20;
		System.out.println(binarySearch(numbers , key));
	}

	
}
