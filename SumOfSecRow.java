package twoDarray;

public class SumOfSecRow {


	private static void sum(int[][] matrix) {
		
		for(int i = 0 ; i <= matrix.length - 1; i++)
		{
			int sum = 0 ;
			for(int j = 0 ; j <= matrix[0].length-1; j++)
			{
				sum += matrix[i][j];
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args)
	{
		 int matrix[][] = {
				 {4,7,8},
				 {11,4,3},
				 {8,7,8}
		 };
		 sum(matrix);
	}
}
