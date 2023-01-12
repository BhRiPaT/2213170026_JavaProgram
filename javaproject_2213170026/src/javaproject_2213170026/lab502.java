package javaproject_2213170026;
import javax.swing.*;

public class lab502 {
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		email = JOptionPane.showInputDialog("Input your e-mail");
		checkEmail(email);
	}
	
	public static void inputEmail() {
		email = JOptionPane.showInputDialog("Input your e-mail");
		checkEmailError(email);
	}
	
	public static void checkEmailError(String chkEmail) {
		while(chkEmail.startsWith("@")||chkEmail.contains(" ")) {
			chkEmail = JOptionPane.showInputDialog
					("Input your e-mail,again :");
		}
		chkEmail = chkEmail.toLowerCase();
		JOptionPane.showInputDialog(null,
				checkEmail(chkEmail)
				?"Your e-mail is "+chkEmail
				:"Your email is not hotmail or gmail dot com");		
	}
	
	public static boolean checkEmail(String chkEmail) {
		if(chkEmail.endsWith("@gmail.com")||chkEmail.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}
}
}