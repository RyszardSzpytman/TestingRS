package warsztaty;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class zadanieWarsztatowe2 {
    private WebDriver driver;

    @Before
    public void setUp() {

        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        // Przejdź do my store
        driver.get("https://prod-kurs.coderslab.pl");
    }

    @Test
    public void customerAccount() throws InterruptedException {

        // Znajdź element logowania
        WebElement searchSignIn = driver.findElement(By.xpath(
                "//a[@title='Log in to your customer account']"));
        searchSignIn.click();

        // Znajdź element wprowadzania logowania Email
        WebElement okienkoEmail = driver.findElement(By.name("email"));

        if(okienkoEmail.isDisplayed()) {

            // Wyczyść tekst zapisany w elemencie
            okienkoEmail.clear();

            // Wpisz informacje do wyszukiwania
            okienkoEmail.sendKeys("jankowal5ki@wp.pl");

            // Pobierz nazwę elementu
            String name = okienkoEmail.getAttribute("name");
            System.out.println("email: " + okienkoEmail.getAttribute("value"));

        } else {

            Assert.fail();
            Assert.assertEquals("email", okienkoEmail.getAttribute("name"));
        }

        // Znajdź element wprowadzania logowania Password
        WebElement okienkoPassword = driver.findElement(By.name("password"));

        if(okienkoPassword.isDisplayed()) {

            // Wyczyść tekst zapisany w elemencie
            okienkoPassword.clear();

            // Wpisz informacje do wyszukiwania
            okienkoPassword.sendKeys("janko1");

            // Pobierz nazwę elementu
            String name = okienkoPassword.getAttribute("name");
            System.out.println("password: " + okienkoPassword.getAttribute("value"));

        } else {
            Assert.fail();
            Assert.assertEquals("password", okienkoPassword.getAttribute("name"));

        }

        // Znajdź element logowania Sign In
        WebElement searchButtonSignIn = driver.findElement(By.id(
                "submit-login"));
        searchButtonSignIn.click();

        // Znajdź element wybierania artykułów CLOTHES
        WebElement searchClothes = driver.findElement(By.xpath(
                "//ul/li[@id='category-3']"));
        searchClothes.click();

        // Wybierz element Hummingbird Printed Sweater
        WebElement chooseSweater = driver.findElement(By.linkText(
                "Hummingbird Printed Sweater"));
        chooseSweater.click();

        // Wybierz rozmiar M
        Select sizeSelect = new Select(driver.findElement(By.id(
                "group_1")));
        sizeSelect.selectByVisibleText("L");

        // Wybierz ilość sztuk 5
        WebElement clothQuantity = driver.findElement(By.xpath(
                "//input[@name='qty']"));
        //clothQuantity.clear();

        //int 5 = Integer.parseInt(5);

        clothQuantity.sendKeys(String.valueOf(5));
        //clothQuantity.sendKeys(5);

        Thread.sleep(2000);

        // Znajdź element dodawania do koszyka ADD TO CARD
        WebElement buttonAddToCard = driver.findElement(By.xpath(
                "//button[@class='btn btn-primary add-to-cart']"));
        buttonAddToCard.click();

        Thread.sleep(1000);

        // Znajdź element opcji PROCEED TO CHECKOUT
        WebElement buttonFirstProceed = driver.findElement(By.xpath(
                "//div/a[text()='Proceed to checkout']"));
        buttonFirstProceed.click();

        // Znajdź element potwierdzenia PROCEED TO CHECKOUT
        WebElement buttonSecondProceed = driver.findElement(By.xpath(
                "//div/a[text()='Proceed to checkout']"));
        buttonSecondProceed.click();

        // Znajdź element potwierdzenia adresu CONTINUE
        WebElement buttonContinue = driver.findElement(By.xpath(
                "//div/button[@type='submit']"));
        buttonContinue.click();

        // Znajdź element potwierdzenia dostawy SHIPPING METHOD
        WebElement buttonContinueShipping = driver.findElement(By.xpath(
                "//button[@name='confirmDeliveryOption']"));
        buttonContinueShipping.click();

        // Znajdź element płatności czekiem PAYMENT
        WebElement optionPayByCheck = driver.findElement(By.xpath(
                "//span/input[@id='payment-option-1']"));
        optionPayByCheck.click();

        // Znajdź element zgoda na warunki sprzedaży "terms of service"
        WebElement termsOfService = driver.findElement(By.xpath(
                "//span/input[@id='conditions_to_approve[terms-and-conditions]']"));
        termsOfService.click();

        // Znajdź element zamówienia ORDER WITH AN OBLIGATION TO PAY
        WebElement buttonOrder = driver.findElement(By.xpath(
                "//div/div/button[@class='btn btn-primary center-block']"));
        buttonOrder.click();

        // Zrób zrzut ekranu SCREENSHOT
        TakesScreenshot scrShot = ((TakesScreenshot)driver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // Zapisz zrzut ekranu
        File DestFile = new File(".\\screenshot\\fullimage.jpg");

    }

    @After
    public void tearDown() throws Exception {

        // Zamknij przeglądarkę

        //driver.quit();
    }


}
