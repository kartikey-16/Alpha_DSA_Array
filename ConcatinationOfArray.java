package in.leetcode;

public class ConcatinationOfArray {
	
	private static int[] conactenate(int[] nums) {
		// TODO Auto-generated method stub
		int ans[] = new int[2 * nums.length];
		for(int i = 0 ; i < nums.length ; i++)
		{
			ans[i] = nums[i];
		}
		int index = nums.length;
		for(int i = 0 ; i < nums.length ; i++)
		{
			ans[index] = nums[i];
			index++;
		}
		
		return ans;
	}

	
	public static void main(String[] args) {
		int [] nums = {1,2,1};
		for(int res : conactenate(nums))
		{
			System.out.print(res +" ");
		}
				
	}
}
