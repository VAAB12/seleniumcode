package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchclass {
	ChromeDriver driver;
	@Given("I am on google page {string}")
	public void i_am_on_google_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(op);
        driver.get(string);
	}

	@When("I search = {string}")
	public void i_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);  
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnK")).submit();
	}
	@Then("click on first link")
	public void click_on_first_link() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3")).click();
	}

}
