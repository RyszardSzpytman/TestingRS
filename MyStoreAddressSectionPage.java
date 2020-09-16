package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressSectionPage {
    private static WebDriver driver;

    @FindBy(xpath = "//ul/li/a[@title='Addresses']")
    WebElement searchAddFirstAddresses;
    @FindBy(xpath = "//a[@data-link-action='add-address']")
    WebElement searchCreateNewAddresses;

    public MyStoreAddressSectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addressSection() {
        searchAddFirstAddresses.click();
        searchCreateNewAddresses.click();
    }
}
