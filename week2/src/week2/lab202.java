package week2;
import java.util.Scanner;
public class lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the nuber of minutes");
		int minutes = scan.nextInt();
		int year = minutes/60/24/365;
		int day = (minutes/60/24)%365;
		System.out.print(minutes+" minutes is approximately "+year+" years and "+day+" days");
	}

}
