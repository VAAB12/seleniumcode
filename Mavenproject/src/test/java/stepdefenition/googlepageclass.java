package stepdefenition;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlepageclass {
	ChromeDriver ob1;
	@Given("go to website {string}")
	public void go_to_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ob1 = new ChromeDriver(op);
		ob1.get(string);
	}

	@When("in searchbar type {string}")
	public void in_searchbar_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 ob1.findElement(By.name("q")).sendKeys(string);
	}

	@Then("click search button")
	public void click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   ob1.findElement(By.name("btnK")).submit();
	}

}
