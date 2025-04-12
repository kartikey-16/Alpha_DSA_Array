package Arrays;

public class LinearSearch {

	private static int linearSearch(int[] number, int key) {
		
		for(int i = 0 ; i < number.length; i++)
		{
			if(number[i] == key )
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args)
	{
		int number[] = {2, 4, 8 ,10 ,16,1,3};
		int key  = 10 ; 
		
		int index = linearSearch(number , key);
		
		if(index == -1)
			System.out.println("Key Not Exist");
		else
			System.out.println("Key At index : " + index);
	}

	
	
}
