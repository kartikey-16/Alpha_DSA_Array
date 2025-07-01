package in.leetcode;

public class FindPivotIndex {


	private static int pivotIndex(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0 , leftSum = 0 ; 
		for(int i = 0 ; i < nums.length ; i ++)
		{
			sum = sum+nums[i];
		}
		for(int i = 0 ; i < nums.length ; i ++)
		{
			if(leftSum == (sum-leftSum - nums[i]))
				return i;
			
			leftSum += nums[i];
			
		}
		
		return -1;
	}

	
	public static void main(String[] args) {
		int nums[] = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));;
	}
}
