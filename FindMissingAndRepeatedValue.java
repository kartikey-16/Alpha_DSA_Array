package in.leetcode;
import java.util.*;

public class FindMissingAndRepeatedValue {

	private static int[] findMissingAndRepeatedValue(int[][] grid) {
		// TODO Auto-generated method stub
		int n = grid.length;
		Set<Integer> set = new HashSet<>();
		int a = 0 , b = 0;
		for(int i = 0 ; i < grid.length ; i ++)
		{
			for(int j = 0 ; j < grid[0].length ; j++)
			{
				if(!set.contains(grid[i][j]))
					set.add(grid[i][j]);
				else
					a = grid[i][j];
			}
		}
		
		for(int  i = 1 ; i <= n*n ; i++ )
		{
			if(!set.contains(i))
			{
				b = i;
				break;
			}
		}
		
		return new int[] {a,b};
	}
	
	public static void main(String[] args) {
		int[][] grid = {{1,3},{2,2}};
		
		for(int i : findMissingAndRepeatedValue(grid))
		{
			System.out.print(i+" ");
		}
	}

}
