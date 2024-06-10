package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class homepageStepdefs {
    WebDriver driver;
    @Given("I load the page")
    public void i_load_the_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @When("I see the page")
    public void i_see_the_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("see the page");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//             js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.linkText("Phones")).click();
    }
    @When("I click on the link")
    public void i_click_on_the_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click the link");
    }
    @Then("I verify the option")
    public void i_verify_the_option() {
    //String text = driver.findElement(By.xpath("//a[text()='Git Pocket Guide']")).getText();
    //System.out.println(text);
    driver.quit();
    }
}
