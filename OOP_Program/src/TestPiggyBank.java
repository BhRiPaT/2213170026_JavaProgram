import java.util.*;
public class TestPiggyBank {
static Scanner scan = new Scanner(System.in);
static piggyBank pb = new piggyBank();
	public static void main(String[] args) {
		/*piggyBank pb = new piggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money: "+34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money: "+13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		sizeofPiggyBank();
	}//end of main()
	
	public static void sizeofPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank:");
		//int size = scan.nextInt();
		//pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank:"+pb.getPiggyBank());
		inputCoin();
	}//end of sizeOfPiggyBank()
	
	public static void inputCoin() {
		while(true) {
		System.out.println("\n====================");
		System.out.println("Menu of PiggyBank");
		System.out.println("====================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[4] five baht.");
		System.out.println("[5] ten baht.");
		System.out.println("[1] Exit");
		System.out.println("\n====================");
		System.out.println("Please select choice");
		int choice = scan.nextInt();
		if(choice==1) {
			System.out.print("Insert 1baht : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}else if(choice==2) {
			System.out.print("Insert 2baht : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}else if(choice==3) {
			System.out.print("Insert 5baht : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}else if(choice==4) { 
			System.out.print("Insert 10baht : ");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total : " + pb.getTotal());
		}else if(choice==5) {
			System.out.print("Bye Bye");
			break;
		}
	}
}//end of inputCoin()
			
		
	}

