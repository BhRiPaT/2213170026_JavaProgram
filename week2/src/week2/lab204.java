package week2;
import javax.swing.*;

public class lab204 {

	public static void main(String[] args) {
		final double TAX_RATE = .0625; 
		String cdId;
		String cdTitle;
		int cdQuantity;
		double cdPrice;
		double cdSubtotal;
		double cdTotal;
		cdId = JOptionPane.showInputDialog("This program calcalates the total cost of a CD order \n"
				+ "Please enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the C in U.S.dollars"));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		cdSubtotal = cdPrice*cdQuantity;
		double Tax = cdSubtotal*TAX_RATE;
		cdTotal = cdSubtotal+Tax;;
		
		JOptionPane.showMessageDialog(null, "Summary of the transaction\n\n"
				+ "CD ID"+cdId+"\n"
						+ "CD Title"+cdTitle+"\n"
								+ "");
	}

}
