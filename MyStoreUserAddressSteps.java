package steps;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.MyStoreUserAddressPage;

public class MyStoreUserAddressSteps {
    private WebDriver driver;

    @And("^fill the address form (.*), (.*), (.*), (.*)$")
    public void fill_the_address_form(
        String address, String city, String zip, String country) {
        MyStoreUserAddressPage addressPage = new MyStoreUserAddressPage(driver);

    }

}
