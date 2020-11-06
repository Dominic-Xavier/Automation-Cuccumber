package pageMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.util.WebTestBase;

public class Address extends WebTestBase {
	
	public Address() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Addresses']")
	private WebElement MyAddress;
	
	@FindBy(how = How.XPATH, using="//a[@title='Add an address']")
	private WebElement addNewAddress;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "company")
	private WebElement company;
	
	@FindBy(name = "address1")
	private WebElement address1;
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement id_state;
	
	@FindBy(name = "postcode")
	private WebElement postcode;
	
	@FindBy(name = "id_country")
	private WebElement country;
	
	@FindBy(name = "phone")
	private WebElement phone;
	
	@FindBy(name = "phone_mobile")
	private WebElement phone_mobile;
	
	@FindBy(name = "alias")
	private WebElement AddressName;
	
	@FindBy(name = "submitAddress")
	private WebElement save;

	public WebElement getMyAddress() {
		return MyAddress;
	}

	public WebElement getAddNewAddress() {
		return addNewAddress;
	}

	public WebElement getfirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getstate() {
		return id_state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	public WebElement getAddressName() {
		return AddressName;
	}

	public WebElement getSave() {
		return save;
	}
	
}
