package in.leetcode;

public class ThreeConsecutiveOdd {
	
	private static boolean threeConsecutiveOdds(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0 ;
		for(int i= 0 ; i < nums.length ; i++)
		{
			if(nums[i] % 2 != 0)
				count++;
			else
				count = 0;
		  if(count>=3)
			return true;
		}
			return false;
	}
	

	public static void main(String[] args) {
		
		int [] nums = { 2,6,4,1};
		System.out.println(threeConsecutiveOdds(nums));;
	}
}
