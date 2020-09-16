package warsztaty;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class zadanieWarsztatowe1 {
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
    public void customerAccount() {

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
            Assert.assertEquals("email", okienkoEmail.getAttribute(
                    "name"));
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

        // Znajdź element wstawiania adresu Addresses
        WebElement searchAddFirstAddresses = driver.findElement(By.xpath(
                "//ul/li/a[@title='Addresses']"));
        searchAddFirstAddresses.click();

        // Znajdź element wstawiania adresu + Create new addresses
        WebElement searchCreateNewAddresses = driver.findElement(By.xpath(
                "//a[@data-link-action='add-address']"));
        searchCreateNewAddresses.click();

        // Znajdź element wprowadzania tekstu Address
        WebElement okienkoAddress = driver.findElement(By.name("address1"));

        if(okienkoAddress.isDisplayed()) {

            // Wyczyść tekst zapisany w elemencie
            okienkoAddress.clear();

            // Wpisz informacje do wyszukiwania
            okienkoAddress.sendKeys("Prosta 51");

            // Pobierz nazwę elementu
            String name = okienkoAddress.getAttribute("name");
            System.out.println("address: " + okienkoAddress.getAttribute("value"));

        } else {

            Assert.fail();
            Assert.assertEquals("address1", okienkoAddress.getAttribute("name"));
        }

        // Znajdź element wprowadzania numeru Postal Code
        WebElement okienkoZipp = driver.findElement(By.name("postcode"));

        if(okienkoZipp.isDisplayed()) {

            // Wyczyść tekst zapisany w elemencie
            okienkoZipp.clear();

            // Wpisz informacje do wyszukiwania
            okienkoZipp.sendKeys("00-000");

            // Pobierz nazwę elementu
            String name = okienkoZipp.getAttribute("name");
            System.out.println("post code: " + okienkoZipp.getAttribute("value"));

        } else {

            Assert.fail();
            Assert.assertEquals("postcode", okienkoZipp.getAttribute("name"));
        }

        // Znajdź element wprowadzania nazwy City
        WebElement okienkoCity = driver.findElement(By.name("city"));

        if(okienkoCity.isDisplayed()) {

            // Wyczyść tekst zapisany w elemencie
            okienkoCity.clear();

            // Wpisz informacje do wyszukiwania
            okienkoCity.sendKeys("Warszawa");

            // Pobierz nazwę elementu
            String name = okienkoCity.getAttribute("name");
            System.out.println("city: " + okienkoCity.getAttribute("value"));

        } else {

            Assert.fail();
            Assert.assertEquals("city", okienkoCity.getAttribute("name"));
        }

        // Znajdź element wyboru Country
        String countryTxt = "United Kingdom";
        WebElement okienkoWyboruCountry = driver.findElement(By.className(
                "col-md-6"));
        okienkoWyboruCountry.click();

        // Znajdź element wyboru United Kingdom
        WebElement pasekWyboruCountry = driver.findElement(By.xpath(
                "//option[@value='17']"));
        pasekWyboruCountry.click();

        // Znajdź element zapisywania Save
        WebElement buttonSave = driver.findElement(By.xpath(
                "//footer/button[@class='btn btn-primary float-xs-right']"));
        buttonSave.click();

        // Sprawdzanie poprawności adresu
        WebElement getAddress = driver.findElement(By.cssSelector(
                "div.address-body"));

        getAddress.getText();

        if(getAddress.isDisplayed()) {

        String name = getAddress.getText();
        System.out.println("Address: " + name);

        } else {

            Assert.fail();

        }

        // Znajdź element kasowania adresu DELETE
        WebElement buttonDelete = driver.findElement(By.xpath(
                "//a[@data-link-action='delete-address']"));
        buttonDelete.click();

    }

    @After
    public void tearDown() throws Exception {

        // Zamknij przeglądarkę

        driver.quit();
    }


}
