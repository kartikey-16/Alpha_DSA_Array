package in.leetcode;

public class TransposeMatrix {
	
     private  static void isTranspose(int[][] nums)
     {
    	 int transpose[][] = new int[nums.length][nums[0].length]  ;
    	 
    	  for(int i  = 0 ; i < nums.length ; i++)
    	  {
    		  for(int j = 0 ; j < nums[0].length ; j++)
    		  {
    			 transpose[j][i] = nums[i][j];
    		  }
    	  }
    	  for(int i  = 0 ; i < nums.length ; i++)
    	  {
    		  for(int j = 0 ; j < nums[0].length ; j++)
    		  {
    			 System.out.print(transpose[i][j]+ " ");
    		  }
    		  System.out.println();
    	  }
     }

     public static void main(String[] args) {
		
    	 int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
    	 isTranspose(nums);
	}
}
