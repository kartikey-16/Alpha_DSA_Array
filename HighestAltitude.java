package in.leetcode;

public class HighestAltitude {


	private static int maxAltitude(int[] gain) {
		// TODO Auto-generated method stub
		int current = 0 , max = 0;
		
		for(int i : gain)
		{
			current += i;
			max = Math.max(current, max);
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		int[] gain = { -5, 1,5,0,-7};
		
		System.out.println(maxAltitude(gain));;
	}
}
