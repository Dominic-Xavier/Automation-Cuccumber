package implementation;

import com.util.WebTestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import operationClasses.AddAddress;
import operationClasses.AddToCart;
import operationClasses.SignIn;
import pageMethods.Address;

public class Automation {
	
	@Given("^user is on the main page$")
	public void user_is_on_the_main_page() throws Exception {
	    WebTestBase.browser("Chrome");
	    WebTestBase.passUrl("http://automationpractice.com/index.php");
	}
	
	@Then("^user logins into the application by entering \"(.*)\" and \"(.*)\" and clicks  on signin button$")
	public void user_logins_into_the_application_by_entering_email_and_password_and_clicks_on_signin_button(String email,String password) {
	    SignIn.login(email, password);
	}
	
	@Then("^user adds a new address \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_adds_a_new_address_and_and_and_and_and_and_and_and_and(String fistName, String lastName, String company, String adress, String city, String state, String zipCode, String Country, String mobil_Phone, String AddressName) {
	    AddAddress.address(fistName, lastName, company, adress, city, state, zipCode, Country, mobil_Phone, AddressName);
	}
	
	@Given("^User navigates to \"(.*)\" category and selects \"(.*)\"$")
	public void user_navigates_to_womens_category_and_selects_summer_dress(String category, String Sub_Category) {
	    AddToCart.choosecategory(category, Sub_Category);
	}
	
	@Then("^user selects list view and orders first item of \"(.*)\" numbers and \"(.*)\" and color Yellow and clicks on add to cart and clicks continue shoppimg and repeats the same process for rest of the two items$")
	public void user_selects_list_view_and_orders_first_item_of_numbers_and_and_color_yellow_and_clicks_on_add_to_cart_and_clicks_continue_shoppimg_and_repeats_the_same_process_for_rest_of_the_two_items(String string, String string2) {
	    
	}
	
	@Then("^user proceeds to checkout and conforms the  order$")
	public void user_proceeds_to_checkout_and_conforms_the_order() {
	    
	}
	
	@Then("^user navigates to order details and takes Screenshot$")
	public void user_navigates_to_order_details_and_takes_screenshot() {
	    
	}
	
	
}
