package in.leetcode;

public class KeepMultiplyingFoundValue {
	


	private static int findFinalValue(int[] nums, int original) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] == original)
			{
				original = original* 2;
				i=-1;
			}
		}
		return original;
		
	}

	
	public static void main(String[] args) {
		
		int nums[] = {5,3,1,6,12};
		int original = 3;
		System.out.println(findFinalValue(nums, original));;
	}
}
