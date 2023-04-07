package MainWork;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }

    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
    }

    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedIn = driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
        if (userloggedIn) {
            System.out.println("User is logged in successfully");
        }
    }

    @When("user enters valid email and valid password")
    public void user_enters_valid_emai() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

       // public void user_is_logged_in_successfully(){
            boolean userloggedIn = driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
            if (userloggedIn) {
                System.out.println("User is logged in successfully");
            }

        }
    }

