package in.leetcode;

public class AlternatingDigitSum {


	private static int alternateDigitSum(int n) {
		// TODO Auto-generated method stub
		String num = n+"";
		
		int sum = Integer.parseInt(num.charAt(0) + "");
		for(int i = 1 ; i < num.length() ; i ++)
		{
			if(i%2 == 1)
				sum -= Integer.parseInt(num.charAt(i)+"");
			else
				sum += Integer.parseInt(num.charAt(i)+"");
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int n = 521;
		System.out.println(alternateDigitSum(n));;
	}

}
