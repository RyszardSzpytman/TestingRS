package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class MyStoreClosePage {
    private static WebDriver driver;

    public MyStoreClosePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void closePage() {

        driver.quit();
    }
}