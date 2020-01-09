package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoHandson {
    static WebDriver driver;
	@Given("User launches the TestMeApp url")
	public void user_launches_the_TestMeApp_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Setting the System Property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//Navigate to the URL
				driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
				
				//Maximize the window
				driver.manage().window().maximize();
	}

	@Given("Application launched  by registered user")
	public void application_launched_by_registered_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Application is launched successfully");

	}

	@Then("User enter the {string}")
	public void user_enter_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//a[@href='login.htm']")).click();
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string);
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on login")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@Then("User clicks on the All Categories tab")
	public void user_clicks_on_the_All_Categories_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Actions actions=new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath(".//span[contains(text(),'Categories')]"))).click().build().perform();
	    Thread.sleep(3000);
	  	
	}

	@Then("User selects the Home Appliances option")
	public void user_selects_the_Home_Appliances_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//span[contains(text(),'Home Appliances')]"))).click().build().perform();
	    Thread.sleep(3000);
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on the Floor option")
	public void user_clicks_on_the_Floor_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//span[contains(text(),'Floor')]"))).click().build().perform();
	    Thread.sleep(3000);
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Add to Cart button")
	public void user_clicks_on_Add_to_Cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//a[contains(text(),'Add to cart')]")).click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on the Remove cart button")
	public void user_clicks_on_the_Remove_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
