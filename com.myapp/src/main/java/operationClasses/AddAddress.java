package operationClasses;

import com.util.WebTestBase;

import pageMethods.Address;

public class AddAddress {
	public static void address(String fistName, String lastName, String company , String adress, String city, String state, String zipCode, String Country, String mobil_Phone, String AddressName) {
		Address address = new Address();
		WebTestBase.click(address.getMyAddress());
		WebTestBase.click(address.getAddNewAddress());
		WebTestBase.sendKeys(address.getfirstName(), fistName);
		WebTestBase.sendKeys(address.getLastname(), lastName);
		WebTestBase.scrollView(address.getSave());
		WebTestBase.sendKeys(address.getCompany(),company);
		WebTestBase.sendKeys(address.getAddress1(), adress);
		WebTestBase.sendKeys(address.getCity(), city);
		WebTestBase.dropdown(address.getstate(), state);
		WebTestBase.sendKeys(address.getPostcode(), zipCode);
		WebTestBase.dropdown(address.getCountry(), Country);
		WebTestBase.sendKeys(address.getPhone(), mobil_Phone);
		WebTestBase.sendKeys(address.getPhone_mobile(), mobil_Phone);
		WebTestBase.sendKeys(address.getAddressName(), AddressName);
		WebTestBase.click(address.getSave());
	}
}
