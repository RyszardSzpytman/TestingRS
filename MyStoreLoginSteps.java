package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MyStoreLoginPage;

public class MyStoreLoginSteps {
    private WebDriver driver;

    @When("^sign in user$")
    public void sign_in_user() {
        MyStoreLoginPage loginPage = new MyStoreLoginPage(driver);
        loginPage.loginAs("jankowal5ki@wp.pl", "janko1");
    }
}
