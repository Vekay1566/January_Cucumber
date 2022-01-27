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

public class LoginClass {
	WebDriver driver;
	
	@Given("User loads applications")
	public void user_loads_applications() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/newtours/index.php");				
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
	    WebElement usernameTxtBox = driver.findElement(By.name("userName"));
	    	usernameTxtBox.sendKeys("test12");
	}
	
	@And("User enters valid password")
	public void user_enters_valid_pasword() {
		driver.findElement(By.name("password")).sendKeys("123");
		}

	@And("User click submit button")
	public void user_click_submit_button() {
	   WebElement submitBtn = driver.findElement(By.name("submit"));	
	   submitBtn.click();
	   }
	
	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	   Assert.assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/test/newtours/"+"login_success.php");
	}

	@And("User should see login success message")
	public void user_should_see_login_success_message() {
	   Assert.assertEquals(driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td[1]/td/h3"))
			   .getText().trim(),"Login Successfully");
	   driver.close();
	}
	
	@And("user hits enter key")
	public void user_hits_enter_key() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	

	
	
	
	
}
