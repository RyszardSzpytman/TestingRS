package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.MyStoreOpenPage;

public class MyStoreOpenSteps {
    private WebDriver driver;

    @Given("^open mystore with google$")
    public void open_mystore_with_google() {
        MyStoreOpenPage openPage = new MyStoreOpenPage(driver);

    }
}
