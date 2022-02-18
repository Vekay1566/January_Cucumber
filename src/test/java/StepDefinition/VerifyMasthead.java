package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyMasthead {
	WebDriver driver;
	
	@Given("User loads the application")
	public void user_loads_applications() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://transfotechacademy.com/");				
		
		}
	@When("Logo displayed in masthead")
	public void Logo_displayed_in_masthead() {
		String tpA = driver.getCurrentUrl();
		String tpE = "https://transfotechacademy.com/";
		Assert.assertEquals(tpA, tpE);
		}
	
	@Then("User clicks on transfotech logo")
	public void User_clicks_on_transfotech_logo()	{
		driver.findElement(By.xpath("//a[@href='https://transfotechacademy.com/']")).click();
	}

	@And("User navigates to transfotech home page")
	public void User_navigates_to_transfotech_home_page()	{
		driver.get("https://transfotechacademy.com/");				

		driver.close();
	}

}