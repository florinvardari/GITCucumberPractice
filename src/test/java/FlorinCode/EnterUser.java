package FlorinCode;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterUser {
    WebDriver driver;
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
    }
}
