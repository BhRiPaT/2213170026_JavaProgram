package javaproject_2213170026;
import java.util.*;
public class lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter your name,separated by a spcae.");
		String fullname = scan.nextLine();
		String fristname = fullname.substring(0,fullname.indexOf(" "));
		System.out.print("abbreviatName" + fristname);
		
	}
	
	

}
