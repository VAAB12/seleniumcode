package stepdefenition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multiplefiles {
	WebDriver browserObject;
	@Given("login to demo website {string}")
	public void login_to_demo_website(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		browserObject = new ChromeDriver(op);
		browserObject.manage().window().maximize();
		browserObject.get(string);
	}

	@When("I type userName = {string} and password = {string}")
	public void i_type_user_name_and_password(String string, String string2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = browserObject.findElement(By.name("Email"));
		WebElement password = browserObject.findElement(By.name("Password"));
		username.clear();
		username.sendKeys(string);
		password.clear();
		password.sendKeys(string2);
	}

	@When("I press login button")
	public void i_press_login_button()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		submitBtn.click();
	}
	@Then("message display {string} text")
	public void message_display_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue=browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		assertEquals(actualValue,string);
	}
}
