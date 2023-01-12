package week4;
import javax.swing.*;
public class example_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail = JOptionPane.showInputDialog
					("Input your e-mail, again");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if (inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")){
			JOptionPane.showMessageDialog(null, "Your email is "+inputEmail);
		}else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}*/
		boolean checkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, 
		(checkEmail)
		?"your email is"+inputEmail
		:"Your e-mail is not hotmail or gmail dot com");
	}

}
