package pageMethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.WebTestBase;

public class Category extends WebTestBase {
	public Category() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(value = {@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li")})
	private List<WebElement> categorys;

	public List<WebElement> getCategorys() {
		return categorys;
	}
}
