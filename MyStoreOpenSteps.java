package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class MyStoreOpenSteps {
    private WebDriver driver;

    @Given("^open mystore with google$")
    public void open_mystore_with_google() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl");

    }

    @When("^sign in user$")
    public void sign_in_user() {
        MyStoreLoginPage loginPage = new MyStoreLoginPage(driver);
        loginPage.loginAs("jankowal5ki@wp.pl", "janko1");
    }

    @Then("^user go to address section$")
    public void user_go_to_address_section(){
        MyStoreAddressSectionPage addressSectionPage=
        new MyStoreAddressSectionPage(driver);
        addressSectionPage.addressSection();
        }

    @And("^fill the address form (.*), (.*), (.*), (.*)$")
    public void fill_the_address_form(
        String address,String city,String zip,String country){
        MyStoreUserAddressPage addressPage = new MyStoreUserAddressPage(driver);
        addressPage.addAddress((String) address, (String) city, (String) zip, (String) country);

        }

    @When("^check address$")
    public void check_address(){
        MyStoreCheckAddressPage checkAddressPage = new MyStoreCheckAddressPage(driver);
        checkAddressPage.checkAddress();
        }

    @And("^close browser$")
    public void close_browser(){
        MyStoreClosePage closePage = new MyStoreClosePage(driver);
        closePage.pageQuit();

        }
}
