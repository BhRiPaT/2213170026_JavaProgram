package javaproject_2213170026;
import java.util.*;
public class Lab_Example603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number[] = new int [5];
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		System.out.println();
		int totalNumber = sumofpos(number);
		System.out.println("Summation of positive number is "+ totalNumber);
		System.out.println("Summation of positive number is "+ sumofpos(number));
	}//end of main()
	

}
