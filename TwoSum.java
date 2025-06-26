package in.leetcode;

import java.util.*;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement), i};
			}
			else
			{
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No Match");
	}
	
	public static void main(String[] args)
	{
		TwoSum twoSum = new TwoSum();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size in array : ");
		int size = sc.nextInt();
	
		int[] nums = new int[size];
		
		System.out.println("Enter numbers in array: ");
		for(int i = 0 ; i < size ; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("enter the target number: ");
		int target = sc.nextInt();
		
		System.out.println("elements in array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]+" ");
		}
		
		System.out.println("Target number : "+ target);
		System.out.println("--------------------------");
		 try {
	            int[] result = twoSum.twoSum(nums, target);
	            System.out.println("Indices: " + result[0] + ", " + result[1]);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		 sc.close();
	}
}
