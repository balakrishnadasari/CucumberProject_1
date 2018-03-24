package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogin {
	
	WebDriver driver;

	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^I enter valid username and password$")
	public void I_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("balakrishna33k@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Aruna@3935");
		driver.findElement(By.xpath("//*[@id='loginbutton']/input")).click();
		
		//driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		//driver.findElement(By.xpath("//div[@id='js_65']/div/div/ul/li[12]/a/span/span")).click();
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	}


}
