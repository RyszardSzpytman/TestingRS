package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStoreOpenPage {
    private static WebDriver driver;

    public MyStoreOpenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl");
    }
}
