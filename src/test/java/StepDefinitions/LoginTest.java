package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver = null;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sreedevi");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.whiteboxqa.com/");
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }





}
