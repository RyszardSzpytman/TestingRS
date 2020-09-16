package steps;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.MyStoreClosePage;

public class MyStoreCloseSteps {
    private WebDriver driver;

    @And("^close browser$")
    public void close_browser() {
        MyStoreClosePage closePage = new MyStoreClosePage(driver);
    }
}
