package TeamLead;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeamLeadWork {
    WebDriver driver;
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedIn=driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
        if (userloggedIn){
            System.out.println("User is logged in successfully");
        }
    }
}
