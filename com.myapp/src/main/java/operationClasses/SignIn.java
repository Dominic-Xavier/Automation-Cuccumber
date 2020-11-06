package operationClasses;

import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

import pageMethods.Login;

public class SignIn {
	public static void login(String email, String password) {
		Login login = new Login();
		WebElement signin = login.getSignin();
		WebTestBase.click(signin);
		WebTestBase.explicitwait(10, login.getEmail());
		WebElement email1 = login.getEmail();
		WebElement passwords = login.getPassword();
		WebTestBase.sendKeys(email1, email);
		WebTestBase.sendKeys(passwords, password);
		WebElement login2 = login.getLogin();
		WebTestBase.click(login2);
	}
	
	public static void signOut() {
		Login login = new Login();
		WebElement ele = login.getLogOut();
		WebTestBase.click(ele);
		
	}
}
