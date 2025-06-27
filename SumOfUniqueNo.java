package in.leetcode;

import java.util.*;

public class SumOfUniqueNo {
	
	
	private static int sumOfUnique(int[] nums) {
		
		Map<Integer , Integer> map = new HashMap<>();
		
		for(int  i = 0 ; i < nums.length ; i ++ )
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		
		int sum = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
				sum = sum + entry.getKey();
		}
		
		return sum;
	}

	
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,2,4};
		System.out.println(sumOfUnique(nums));;
	}
}
