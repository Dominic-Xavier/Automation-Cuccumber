package pageMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.util.WebTestBase;

public class Login extends WebTestBase {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign in")
	private WebElement signin;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(how = How.ID, using="SubmitLogin")
	private WebElement login;
	
	@FindBy(how = How.LINK_TEXT, using="Sign out")
	private WebElement LogOut;
	
  public WebElement getLogOut() {return LogOut;}

  public WebElement getSignin() { return signin; }
  
  public WebElement getEmail() { return email; }
  
  public WebElement getPassword() { return password; }
  
  public WebElement getLogin() { return login; }

	 
}
