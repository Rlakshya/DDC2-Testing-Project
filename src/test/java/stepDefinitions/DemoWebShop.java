package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert;
public class DemoWebShop {

	static WebDriver	driver;
	@Given("User launches the DemoWebShop App")
	public void user_launches_the_DemoWebShop_App() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://demowebshop.tricentis.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implement Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//a[@href='/register']")).click();
		
	}

	@Then("User provides the valid data for all the fields")
	public void user_provides_the_valid_data_for_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='gender-male']")).click();
		driver.findElement(By.xpath(".//input[@name='FirstName']")).sendKeys("Lakshya");
		driver.findElement(By.xpath(".//input[@name='LastName']")).sendKeys("Reejwani");
		driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys("betheonlyone@gmail.com");
		driver.findElement(By.xpath(".//input[@name='Password']")).sendKeys("lakshya123");
		driver.findElement(By.xpath(".//input[@name='ConfirmPassword']")).sendKeys("lakshya123");
		
	}

	@When("User clicks on submit button at the end of the form")
	public void user_clicks_on_submit_button_at_the_end_of_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//input[@name='register-button']")).click();
	}

	@Then("Verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
	    // Write code here that turns the phrase above into concrete actions
		String str = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		Assert.assertTrue(str.contains("Your registration completed"));
	   // throw new cucumber.api.PendingException();
		
	}

	@Then("Prints the message")
	public void prints_the_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Your registration completed");
	    //throw new cucumber.api.PendingException();
	}

	@Given("Application launched by registered user")
	public void application_launched_by_registered_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://demowebshop.tricentis.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implement Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //throw new cucumber.api.PendingException();
		
	}

	@Then("User access the login link")
	public void user_access_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//a[@href='/login']")).click();
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//input[@class='email']")).sendKeys("betheonlyone@gmail.com");
		driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys("lakshya123");
		driver.findElement(By.xpath(".//input[@value='Log in']")).click();
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
		String result = driver.findElement(By.xpath(".//a[@href='/customer/info']")).getText();
		Assert.assertTrue(result.contains("betheonlyone@gmail.com"));
	    //throw new cucumber.api.PendingException();
	}
}
