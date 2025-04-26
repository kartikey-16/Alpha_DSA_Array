package twoDarray;

public class DiagonalSum {


	private static void diagonalSum(int[][] matrix) {
		int sum = 0 ;
		
		// It Takes time complexity of O(n^2)
//		for(int i = 0 ;  i< matrix.length; i++)
//		{
//			for(int j = 0; j < matrix[0].length; j++)
//			{
//				
//				//Primary Diagonal***
//				if(i == j)
//				{
//					sum += matrix[i][j];
//				}
//				
//				// Secondary Diagonal****
//				if(i+j == matrix.length-1)
//				{
//					sum += matrix[i][j];
//				}
//			}
//		}
		
		for(int i = 0 ;  i< matrix.length; i++)
		{
			//Primary Diagonal
			sum += matrix[i][i];
			
			//Secondary Diagonal
			if(i != matrix.length-1-i)
				sum += matrix[i][matrix.length-1-i];
		}
		
		System.out.println(sum);
	}
	
	
	public static void main(String args[]) {
		int matrix [][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		diagonalSum(matrix);
	}
	

}
