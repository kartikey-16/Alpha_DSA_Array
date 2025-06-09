package in.leetcode;
import java.util.*;

import java.util.Arrays;

public class ArrayIsGood {


	private static boolean isGood(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int max = nums[nums.length-1];
		if(nums.length != (max+1))
			return false;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i])+1);
			else
				map.put(nums[i], 1);
		}
		
		List<Integer> list = new ArrayList<>(map.values());
		int count = 0; 
		for(int num : list)
		{
			if(num >= 2)
				count++;
		}
		if(map.get(max) == 2 && count == 1)
			return true;
		
		return false;
		
	}

	
	public static void main(String[] args) {
		int nums [] = {2,1,3};
		System.out.println(isGood(nums));;
	}
}
