package in.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNo {
	
	public static Set<Integer> removeDuplicate(int[] nums)
	{
		Set<Integer> set = new HashSet<>();
		for(int i= 0 ; i< nums.length ; i++)
		{
			if(!set.contains(nums[i]))
			{
				set.add(nums[i]);
			}
			
		}
		
		
		return set ;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,1,3,3,5};
		
		Set<Integer> res = removeDuplicate( nums);
		System.out.println(res);
	}

}
