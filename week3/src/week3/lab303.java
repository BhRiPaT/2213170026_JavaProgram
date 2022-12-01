package week3;
import javax.swing.*;
import java.text.*;
import java.util.Random;
public class lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int youwithdraw =Integer.parseInt(JOptionPane.showInputDialog(null,"Your balance: "+balance+ "\nInput money to withdraw:"));
		//JOptionPane.showMessageDialog(null, "Cannot with draw more than balance");
		if(youwithdraw>balance) {
			JOptionPane.showMessageDialog(null, "Cannot withdraw more than balance");
		}
		else if(youwithdraw>20000) {
			JOptionPane.showMessageDialog(null, "Cannot withdraw more than 20,000");
		}
		else if(youwithdraw%100!=0) {
			JOptionPane.showMessageDialog(null, "Cannot withdraw "+youwithdraw%100+"baht.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+youwithdraw+ "baht.\n"
					+ "1000="+youwithdraw/1000+"\n"
					+"500="+youwithdraw%1000/500+"\n"
					+"100="+youwithdraw%500/100);
			
		}
	}
}
