package Arrays;

public class ArrayAsFA {

	private static void update(int[] marks) {
		// TODO Auto-generated method stub
		for(int i = 0; i < marks.length ; i++ )
		{
			marks[i] = marks[i] + 1;
		}
		
	}
	public static void main (String agrs[])
	{
		int marks[] = {97,98,99};
		update(marks);
		for(int i = 0; i < marks.length ; i++ )
		{
			System.out.print(marks[i]+" ");
		}
		
		System.out.println();
	}

	
}
