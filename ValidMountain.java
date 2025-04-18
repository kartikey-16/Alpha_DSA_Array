package in.leetcode;

public class ValidMountain {
	
	private static boolean isValidMountainArray(int[] nums) {
		int i = 0 , j = nums.length -1;
		
		if(nums.length <= 3 )
		{
			return false;
		}
		
			while(i+1 < nums.length && nums[i] < nums[i+1])
			{
				i++;
			}
			
			while(j > 0 && nums[j] < nums[j-1])
			{
				j--;
			}
			if(i > 0  && j < nums.length -1)
			{
				if(i == j)
				{
					return true;
				}
			}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,4,5,2,1,0};
		
		System.out.println(isValidMountainArray(nums));
	}

}
