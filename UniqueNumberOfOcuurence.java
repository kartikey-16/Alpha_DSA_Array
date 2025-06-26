package in.leetcode;
import java.util.*;
public class UniqueNumberOfOcuurence {



	private static boolean uniqueOccurence(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		Set<Integer> set = new HashSet<>(map.values());
		if(map.size() == set.size())
			return true;
		
		return false;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,1,3,1};
		System.out.println(uniqueOccurence(arr));;
	}
}
