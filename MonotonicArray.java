package in.leetcode;

public class MonotonicArray {

	private static boolean isMonotonic(int[] nums) {
		// TODO Auto-generated method stub
		boolean isIncreasing = true;
		boolean isDecreasing =  true;
		
		for(int i = 1 ; i < nums.length ; i++ )
		{
			if(nums[i] >= nums[i-1])
			{
				isDecreasing = false;
			}
			else
			{
				isIncreasing = false;
			}
		}
		
		if(isIncreasing || isDecreasing)
			return true;
		
		return false;
		
	}

	
	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3};
		System.out.println(isMonotonic(nums));;
	}
}
