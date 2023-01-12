package week4;
import java.util.*;
public class lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name");
		String FullName = scan.nextLine();
		int n = FullName.trim().indexOf(" ");
		if(n!=-1 ) {//spacebar
		String firstName FullName.substring(0, n);
		}
		else {
			System.out.print("incorrect name");//no spacebar
		}
		
		
		
	}

}
