package week4;
import java.util.*;
public class example_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input asentence : ");
		String sentence =scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Inputa sentence, again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofWord=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofWord++;
			}
		}
		System.out.println("This sentence has "+spaceofWord+" spacebar.");
		System.out.println("This sentence has "+(spaceofWord+1)+" word.");
	}

}
