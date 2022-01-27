package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageLinkTest {
	
	WebDriver driver;
	
	@Given ("User loads application") 
		public void User_loads_application() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.demo.guru99.com/test/newtours/index.php");		
		}
		
	@When ("User clicks Register Button")
		public void User_clicks_Register_Button() {
		driver.findElement(By.linkText("REGISTER")).click();
		}
	
	@Then ("User should land on Register Page")
		public void User_should_land_on_Register_Page() {
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	}
	
	
	
	
	
	
	
	
}
