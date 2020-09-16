package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreUserAddressPage {
    private static WebDriver driver;

    @FindBy(name = "address1")
    WebElement okienkoAddress;
    @FindBy(name = "postcode")
    WebElement okienkoZip;
    @FindBy(name = "city")
    WebElement okienkoCity;
    @FindBy(className = "col-md-6")
    WebElement okienkoWyboruCountry;
    @FindBy(xpath = "//option[@value='17']")
    WebElement pasekWyboruCountry;
    @FindBy(xpath = "//footer/button[@class='btn btn-primary float-xs-right']")
    WebElement buttonSave;

    public MyStoreUserAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addAddress(
            String address, String city, String zip, String country) {
        okienkoAddress.clear();
        okienkoAddress.sendKeys(address);
        okienkoCity.clear();
        okienkoCity.sendKeys(city);
        okienkoZip.clear();
        okienkoZip.sendKeys(zip);
        okienkoWyboruCountry.click();
        pasekWyboruCountry.click();
        buttonSave.click();

    }
}
