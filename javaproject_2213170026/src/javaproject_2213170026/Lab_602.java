package javaproject_2213170026;
import java.util.*;
public class Lab_602 {
	static Scanner scan = new Scanner(System.in);
	static double sum =0;
	static double averageNumber=0;
	public static void main(String[] args) {
		double[] inputScore = new double[5];
		for(int i=0; i<inputScore.length;i++) {
			System.out.println("Input score of student "+(i+1)+" : ");
			inputScore[i] =scan.nextDouble();
			sum += inputScore[i];
		}//end of for
		
		System.out.println();
		averageNumber = sum /(inputScore.length);
		System.out.println("Average of "+ inputScore.length+" student is "+averageNumber);
		for(int i =0; i<inputScore.length;i++) {
			if(inputScore[i]>averageNumber) {
				System.out.println()
			}
		}
	}
	
}
