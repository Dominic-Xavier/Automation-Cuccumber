package operationClasses;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

import pageMethods.Category;

public class AddToCart {
	static Category elements = new Category();
	public  static void choosecategory(String category, String Sub_category) {
		List<WebElement> allcategory = elements.getCategorys();
		for (WebElement webElement : allcategory) {
			String element_details = webElement.getText();
			if(element_details.equalsIgnoreCase(category)) {
				WebTestBase.mouseOver(webElement);
				break;
			}
		}
		
		for (WebElement webElement : allcategory) {
			String element_details = webElement.getText();
			if(element_details.equalsIgnoreCase(Sub_category)) {
				WebTestBase.click(webElement);
				break;
			}
		}
		
	}
	
	public static void viewType() {
		WebTestBase.click(elements.getListView());
	}
}
