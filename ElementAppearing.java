package in.leetcode;
import java.util.*;
public class ElementAppearing {


	private static int findSpecialInteger(int[] nums) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums)
		{
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}
			else
				map.put(num, 1);
			
			if(map.get(num) > nums.length / 4 )
			{
				return num;
			}
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
		int nums[] = {1,2,2,6,6,6,6,7,10};
		System.out.println(findSpecialInteger(nums));;
	}
}
