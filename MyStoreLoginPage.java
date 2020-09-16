package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {
    private static WebDriver driver;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement searchSignIn;
    @FindBy(name = "email")
    WebElement okienkoEmail;
    @FindBy(name = "password")
    WebElement okienkoPassword;
    @FindBy(id = "submit-login")
    WebElement searchButtonSignIn;

    public MyStoreLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String email, String password) {
        searchSignIn.click();
        okienkoEmail.clear();
        okienkoEmail.sendKeys(email);
        okienkoPassword.clear();
        okienkoPassword.sendKeys(password);
        searchButtonSignIn.click();
    }
}
