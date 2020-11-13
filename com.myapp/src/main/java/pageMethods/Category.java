package pageMethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.WebTestBase;

public class Category extends WebTestBase {
	
	private Category() {
		PageFactory.initElements(driver, this);
	}
	
	private static Category category = null;
	
	public static synchronized Category getInstance() {
		if(category==null) 
			category = new Category();
		
		return category;
	}
	
	private static String index;
	
	public static String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	@FindAll(value = {@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li")})
	private List<WebElement> categorys;
	
	@FindBy(xpath = "//a[@title='List']")
	private WebElement listView;
	
	@FindBy(xpath = "(//a[@title='View'])[2]")
	private WebElement more;

	public WebElement getListView() {
		return listView;
	}

	public List<WebElement> getCategorys() {
		return categorys;
	}

	@FindBy(xpath = "(//a[@title='Add to cart'])[2]")
	private WebElement ele;
}
