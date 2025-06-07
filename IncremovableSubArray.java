package in.leetcode;

public class IncremovableSubArray {
	

	private static int incremovableUubArrayCount(int[] nums) {
		// TODO Auto-generated method stub
		
		int count = 0 ; 
		int  len = nums.length;
		for(int i = 0 ; i < len ;i++ )
		{
			for(int  j = i ; j < len ; j++)
			{
				if(isIncreasingArray(nums , i , j))
				{
					count++;
				}
			}
		}
		return count;
		
	}
	

	private static boolean isIncreasingArray(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		
		int len = nums.length;
		int prev = 0;
		
		for(int i = 0 ; i < len ; i++)
		{
			if(i <= end && i>= start)
			{
				continue;
			}
			if(nums[i] <= prev)
			{
				return false;
			}
			prev = nums[i];
		}
		return true;
	}


	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(incremovableUubArrayCount(nums));
	}

}
