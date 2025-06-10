package in.leetcode;

public class CalDelayedArrivalTime {


	private static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
		// TODO Auto-generated method stub
		int arrival = 0 ;
		arrival = delayedTime + arrivalTime;
		if(arrival >= 24)
			arrival = arrival % 24;
		
		return arrival;
		
	}

	public static void main(String[] args) {
		
		int arrivalTime = 15;
		int delayedTime = 9;
		System.out.println(findDelayedArrivalTime(arrivalTime, delayedTime));;
	}
}
