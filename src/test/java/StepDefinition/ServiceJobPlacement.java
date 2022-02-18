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

public class ServiceJobPlacement {


	WebDriver driver;
	
	@Given ("User loads Transfotech homepage") 
	public void User_loads_Transfotech_homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://transfotechacademy.com/");	
		
		}	
	
	@When("User mouse hover on Service Drop menu")
	public void User_mouse_hover_on_Service_Drop_menu() {	
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.linkText("Service"));
		action.moveToElement(service);
		action.doubleClick();
		action.build().perform();
		
		
		}	
	@And("User clicks on Job Placement link")
	public void User_clicks_on_Job_Placement_link() {
		driver.findElement(By.linkText("Job Placement")).click();	
		}
	@And("User lands on Job placement page")
	public void User_lands_on_Job_placement_page()  {
		  System.out.println("Url of Job Placement page:"+ driver.getCurrentUrl());
	}
		
	@And("User clicks on Book an Appointment button")
	public void User_clicks_on_Book_an_Appointment_button() {
		driver.findElement(By.xpath("//span[@class='elementor-icon-list-text']")).click();	
		
		driver.close();	
	}
}

	
	

