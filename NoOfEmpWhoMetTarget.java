package in.leetcode;

public class NoOfEmpWhoMetTarget {


	private static int noOfEmpWhoMetTarget(int[] hours, int target) {
		// TODO Auto-generated method stub
		int count = 0 ;
		for(int i : hours)
		{
			if(i >= target)
			{
				count++;
			}
		}
		return count;
	}

	
	public static void main(String[] args) {
		int hours[] = {0,1,2,3,4};
		int target = 2;
		System.out.println(noOfEmpWhoMetTarget(hours , target));;
	}
}
