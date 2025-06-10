package in.leetcode;

public class ConvertTemperature {


	private static double[] convertTemperature(double celcius) {
		// TODO Auto-generated method stub
		double[] ans = new double[2];
		
		double kelvin = celcius + 273.15;
		double fahrenheit = (celcius * 1.80) + 32.00;
		
		ans[0] = kelvin;
		ans[1] = fahrenheit;
		
		return ans;
	}

	
	public static void main(String[] args) {
		double celcius = 36.50;
		for(double d : convertTemperature(celcius))
		{
			System.out.println(d);
		}
	}
}
