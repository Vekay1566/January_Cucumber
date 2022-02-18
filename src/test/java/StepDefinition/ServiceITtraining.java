package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceITtraining {
	
	WebDriver driver;
	               
	@Given ("User loads application") 
	public void User_loads_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://transfotechacademy.com/");	
		}	

	@When("User moves cursor on Service Drop menu")
	public void User_moves_cursor_on_Service_Drop_menu() {	
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Service"));
		action.moveToElement(service).build().perform();
		action.click().build().perform();
		}	
	@And("User clicks on IT training link")
	public void User_clicks_on_IT_training_link() {
		driver.findElement(By.linkText("IT Training")).click();	
		}
	@And("User lands on IT training page")
	public void User_lands_on_IT_training_page()  {
		String apUrl = driver.getCurrentUrl();
		String expectedPageUrl ="https://transfotechacademy.com/it-training/";
		Assert.assertEquals(expectedPageUrl,apUrl);
		}
	@And("User clicks on Apply Now Button")
	public void User_clicks_on_Apply_Now_Button() {
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Apply Now"));
		action.moveToElement(service).build().perform();
		action.click().build().perform();
	
		}
	@Then("User land on student registration page")
	public void User_lands_on_student_registration_page() {
		String SRPageUrl = driver.getCurrentUrl();
		String SRexpectedPageUrl ="https://transfotechacademy.com/student-registration/";
		Assert.assertEquals(SRPageUrl, SRexpectedPageUrl);
		
		driver.close();	
	}
}
