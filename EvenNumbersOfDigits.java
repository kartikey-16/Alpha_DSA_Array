package in.leetcode;

public class EvenNumbersOfDigits {
	private static int findNumbers(int[] nums) {
		int count =0 , digit = 0 ;
		if(nums.length == 0)
			return 0;
		for(int i = 0 ; i < nums.length; i++)
		{
			while(nums[i] !=0 )
			{
				nums[i] = nums[i]/10;
				digit++;
			}
			if(digit % 2 ==0)
				count ++;
		}
		return count;
		
	}

	
	public static void main(String[] args) {
		int[] nums = {12 , 345, 6, 2, 7869};
		
		System.out.println(findNumbers(nums));
	}

	
}
