package operationClasses;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

import pageMethods.Category;

public class AddToCart {
	public  static void choosecategory(String category, String Sub_category) {
		Category elements = new Category();
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
}
