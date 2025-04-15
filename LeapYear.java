package Arrays;

public class LeapYear {
	    
		   public static int[] findLeapYears(int year){
		       //Implement your code here and change the return value accordingly
		       int [] leapYears = new int[15];
		       int count = 0;

		        while (count < 15) {
		            if (isLeapYear(year)) {
		                leapYears[count] = year;
		                count++;
		            }
		            year++;
		        }

		        return leapYears;
		    }

		    // Utility method to check for leap year
		    private static boolean isLeapYear(int year) {
		        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    }
		       
		    
		   public static void main(String[] args) {
		       int year = 2000;
			   int[] leapYears;
			   leapYears=findLeapYears(year);
			   for ( int index = 0; index<leapYears.length; index++ ) {
			       System.out.println(leapYears[index]);
			   }
		    }
}
