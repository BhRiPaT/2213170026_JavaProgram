package javaproject_2213170026;
import javax.swing.*;

public final class lab503 {
	static int inputYear;
	public static void main(String[] args) {
		inputYear =Integer.parseInt(JOptionPane.showInputDialog("input Year"));
	//	boolean chkYear = checkYear(inputYear);
	//	System.out.println(chkYear);
		
		while(!checkYear(inputYear)) {
			inputYear = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-300" 
					+ "\nInput Year, again"));
		}
		/*if(isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear+" is Leap Year");
		}else {
			JOptionPane.showMessageDialog(null, inputYear+" is not Leap Year");
		}*/
		JOptionPane.showMessageDialog(null, inputYear+(
				isLeapYear(inputYear)
				?" is"
				:" is not ")+"Leap Year");
	}//end of main() method
	
	public static boolean isLeapYear(int year) {
		if((year%4==0) && ((year%100!=0)||(year%400==0))) {
			return true;
		}else {
			return false;
		}
		
	}

}