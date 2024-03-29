package javaproject_2213170026;

public class lab501 {

	public static void main(String[] args) {
		//String format
		System.out.println(formatNumber(500));
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(89.9334));
		System.out.println(formatNumber("550"));
	}
	
	//Overloading Method
	private static String formatNumber(int value) {
		return String.format("%d", value);
	}
	
	private static String foematNumber(double value) {
		return String.format("%3f",value);
	}
	
	private static String formatNumber(String value) {
		return String.format("%2f", Double.parseDouble(value));
	}
}
