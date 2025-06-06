package in.leetcode;
import java.util.Arrays;

public class MinimumNumberGame {


	private static int[] numberGame(int[] nums) {
		// TODO Auto-generated method stub
		int arr[] = new int[nums.length];
		Arrays.sort(nums);
		int bob =0 , alice = 1;
		for(int i = 1 ; i < nums.length ; i += 2)
		{
			arr[bob] = nums[i];
			bob += 2;
		}
		for(int i = 0 ; i < nums.length ; i += 2)
		{
			arr[alice] = nums[i];
			alice += 2;
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int  [] nums = {5,4,2,3};
		for(int i : numberGame(nums))
		{
			System.out.print(i+" ");
		}
	}
}
