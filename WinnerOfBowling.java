package in.leetcode;

public class WinnerOfBowling {


	private static int isWinner(int[] player1, int[] player2) {
		// TODO Auto-generated method stub
		int p1_score = countScore(player1);
		int p2_score = countScore(player2);
		if(p1_score > p2_score)
			return 1;
		else if(p1_score < p2_score)
			return 2;
		
		return 0;
		
	}

	private static int countScore(int[] arr) {
		// TODO Auto-generated method stub
		int score = 0;
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(i ==1)
			{
				if(arr[i-1] == 10)
					score += (2 * arr[i]);
				else
					score += arr[i];
			}
			else if(i > 1)
			{
				if(arr[i-1] == 10 || arr[i-2] ==10)
					score += (2 * arr[i]);
				else
					score += arr[i];
			}
			else
				score += arr[i];
		}
		return score;
	}

	public static void main(String[] args) {
		int[] player1 = {4,10,7,9};
		int [] player2 = {6,5,2,3};
		
		System.out.println(isWinner(player1 , player2));;
	}
}
