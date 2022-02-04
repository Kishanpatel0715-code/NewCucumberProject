package stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	WebDriver driver;
	Properties prop;
	
	public LoginStepDefinition() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Selenium_workspace\\FreeAmazonBddFreamwork\\src\\main\\java\\confing\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Given("^user is already on login Page$")
	public void user_is_already_on_login_Page() throws Throwable {
	
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\new chromedriver4\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	   driver.get(prop.getProperty("url"));
	}

	@When("^title of login page is amazon signIn$")
	public void title_of_login_page_is_amazon_signIn() throws Throwable {
	   String title = driver.getTitle();
	   Assert.assertEquals(title, "Amazon Sign In");
	}

	@Then("^user enters emailId$")
	public void user_enters_emailId() throws Throwable {
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));

	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		driver.findElement(By.id("continue")).click();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
	   driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	   driver.findElement(By.id("signInSubmit")).click();
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.quit();
	}

}
