package in.leetcode;

public class FirstLetterAppearTwice {
	
	private static char repeatedCharacter(String s) {
		// TODO Auto-generated method stub
		int [] arr = new int[26];
		for(int i =0 ; i < s.length(); i++)
		{
			arr[s.charAt(i) - 'a']++;
			if(arr[s.charAt(i) - 'a'] == 2)
			{
				return s.charAt(i);
			}
		}
		return 0;
	}

	
	public static void main(String[] args) {
		String s ="abacbaacz";
		System.out.println(repeatedCharacter(s));;
	}
}
