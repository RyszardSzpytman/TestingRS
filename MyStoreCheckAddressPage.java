package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreCheckAddressPage {
    private static WebDriver driver;

    //@FindBy(cssSelector = "div.address-body")
    @FindBy(css = "div.address-body")
    WebElement getAddress;
    @FindBy(xpath = "//a[@data-link-action='delete-address']")
    WebElement buttonDelete;

    public MyStoreCheckAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void checkAddressPage() {
        getAddress.getText();

        if(getAddress.isDisplayed()) {

            String name = getAddress.getText();
            System.out.println("Address: " + name);

        } else {

            Assert.fail();

        }

        buttonDelete.click();
    }

}
