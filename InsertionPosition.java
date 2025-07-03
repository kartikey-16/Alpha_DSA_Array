//Question::= given a sorted array of integer and target value ,return index if the target value is found or return the index where it would be  if it were inserted in order 
package in.leetcode;

import java.util.Scanner;

public class InsertionPosition {
	
	public int searchInsertion(int [] nums , int target)
	{
		// time complexity is o(n);
//		for(int i = 0 ; i < nums.length ; i++)
//		{
//			if(nums[i] == target)
//				return i;
//		}
//		return 0;
		
		// We have to obtain with O(logn) so we use binary search
		
		
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
		return left;
	}

	public static void main(String[] args)
	{
		InsertionPosition insertionPosition = new InsertionPosition();
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
	            int result = insertionPosition.searchInsertion(nums, target);
	            System.out.println("" + result );
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		 sc.close();
	}
}
