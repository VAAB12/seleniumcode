package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logoclass {
	ChromeDriver driver;
	WebElement googleLogo;
	@Given("I am on the google page {string}")
	public void i_am_on_the_google_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(string);  
	}

	@When("I search for Google Logo webelement")
	public void i_search_for_google_logo_webelement() {
	    // Write code here that turns the phrase above into concrete actions
		googleLogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        System.out.println("find and stor the web element for the Google Logo");  
	}

	@Then("I should get webelement isDisplayed")
	public void i_should_get_webelement_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, googleLogo.isDisplayed());
        System.out.println("Google logo is displayed – Assert passed");   
	}

}
