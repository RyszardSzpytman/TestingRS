package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MyStoreCheckAddressPage;

public class MyStoreCheckAddressSteps {
    private WebDriver driver;

    @When("^check address$")
    public void check_address() {
        MyStoreCheckAddressPage checkAddressPage =
                new MyStoreCheckAddressPage(driver);
    }
}
