package FlorinCode;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterUser {
    WebDriver driver;
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
    }
    @When("click on login button")
    public void click_on_login_button() {

        WebElement loginBtn=driver.findElement(By.id("btnLogin"));

    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedIn=driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
        if (userloggedIn){
            System.out.println("User is logged in successfully");
        }
    }
}
