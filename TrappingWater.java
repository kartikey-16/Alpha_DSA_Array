package Arrays;

public class TrappingWater {


	private static void trappingWater(int[] numbers) {
		int right[] = new int[numbers.length];
		int left[] = new int[numbers.length];
		int trappedWater = 0;
		
		for(int i = 0; i < numbers.length ; i++)
		{
			if(numbers[i] < 0 )
				numbers[i] = 0;
			//System.out.print(numbers[i]+" ");
		}
//		System.out.println();
		// to store the left max boundaries ******** 
		left[0] = numbers[0];
		for(int i = 1; i < numbers.length ; i++)
		{
			left [i] = Math.max(left[i-1], numbers[i]);
			System.out.print(left[i]+" ");
		}
		System.out.println();
		
		// to store the right max boundaries **********
		 right[numbers.length - 1] = numbers[numbers.length - 1]; 
		for(int i = numbers.length - 2; i >= 0  ; i--)
		{
			right[i] = Math.max(right[i + 1], numbers[i]);
			System.out.print(right[i]+" ");
		}
		System.out.println();
		
		//to find the water level = min from left max and right max
		for(int i = 0; i < numbers.length ; i++)
		{
			int waterLevel= Math.min(left[i], right[i]);
			trappedWater += (waterLevel - numbers[i]);
		}
		System.out.println();
		System.out.print(trappedWater);
		
	}
	
	
	public static void main(String args[])
	{	
		int numbers[] = {4,2,0,6,3,2,5};
		trappingWater(numbers);
		
	}

}
