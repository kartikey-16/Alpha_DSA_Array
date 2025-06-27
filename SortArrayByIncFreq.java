package in.leetcode;
import java.util.*;
public class SortArrayByIncFreq {
	

	private static int[] sortByIncreaseFreq(int[] arr) {
		// TODO Auto-generated method stub
		
		Map<Integer , Integer> map = new HashMap<>();
		for(int  i = 0 ; i < arr.length ; i ++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		 Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

	        Arrays.sort(boxedArr, (a, b) -> {
	            int freqA = map.get(a);
	            int freqB = map.get(b);
	            if (freqA != freqB) {
	                return Integer.compare(freqA, freqB); // Sort by increasing frequency
	            } else {
	                return Integer.compare(b, a); // For same frequency, sort by decreasing value
	            }
	        });

	        // Convert back to int[]
	        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		int [ ] arr = {1,1,2,3,2 ,2};
		
		 int[] sorted = sortByIncreaseFreq(arr);
	        System.out.println(Arrays.toString(sorted));
	}

}
