package in.leetcode;

import java.util.Scanner;

public class BinarySearch {

	public int searchIndex(int [] nums , int target)
	{	
		int mid; 
		int left = 0;
		int right = nums.length - 1;
		while(left <= right)
		{
			mid = left + (right - left)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			else if(target < nums[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		BinarySearch binarySearch = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size in array : ");
		int size = sc.nextInt();
	
		int[] nums = new int[size];
		
		System.out.println("Enter numbers in array in the accending order: ");
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
	            int result = binarySearch.searchIndex(nums, target);
	            System.out.println("Index :" + result );
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		 sc.close();
	}
	
}
