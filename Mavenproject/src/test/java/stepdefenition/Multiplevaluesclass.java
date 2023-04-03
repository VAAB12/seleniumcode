package stepdefenition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiplevaluesclass {
	ChromeDriver driver;
	@Given("I am on the demo site login {string}")
	public void i_am_on_the_demo_site_login(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);  
	}

	@When("I enter userName = {string} and password = {string}")
	public void i_enter_user_name_and_password(String string, String string2) {
		WebElement username = driver.findElement(By.name("Email"));
		WebElement password = driver.findElement(By.name("Password"));
		username.clear();
		username.sendKeys(string);
		password.clear();
		password.sendKeys(string2);   
	}

	@When("I click login button")
	public void i_click_login_button() {
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		submitBtn.click(); 
	}

	@Then("text to display {string} text")
	public void text_to_display_text(String string) {
		String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		assertEquals(actualValue,string); 
	}

}
