package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.MyStoreAddressSectionPage;

public class MyStoreAddressSectionSteps {
    private WebDriver driver;

    @Then("^user go to address section$")
    public void user_go_to_address_section() {
        MyStoreAddressSectionPage addressSectionPage =
                new MyStoreAddressSectionPage(driver);
    }
}
