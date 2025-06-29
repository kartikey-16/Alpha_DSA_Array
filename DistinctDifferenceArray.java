package in.leetcode;
import java.util.*;
public class DistinctDifferenceArray {


	private static int[] distinctDifference(int[] nums) {
		// TODO Auto-generated method stub
		Set<Integer> preffix = new HashSet<>();
		Set<Integer> suffix = new HashSet<>();
		int diff[] = new int[nums.length];
		
		for(int i = 0 ; i < nums.length; i++)
		{
			preffix.add(nums[i]);
			for(int j = i+1 ; j< nums.length; j++)
			{
				suffix.add(nums[j]);
			}
			diff[i] = preffix.size() - suffix.size();
			suffix.clear();
		}
		
		return diff;
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		for(int n : distinctDifference(nums))
		{
			System.out.print(n+"  ");
		}
	}
}
