package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Threewebsites {
	ChromeDriver driver;
	
	@Given("user is on Google home page {string}")
	public void user_is_on_google_home_page(String arg1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");  
	}

	@Then("user enters keyword {string}")
	public void user_enters_keyword(String arg1) {
		driver.findElement(By.name("q")).sendKeys(arg1);
        System.out.println(arg1 + "\t is the keyword");   
	}

	@Then("user submits the page")
	public void user_submits_the_page() {
		driver.findElement(By.name("btnK")).submit();
        System.out.println("\t submit here");
	}

	@Then("user waits for {int} seconds for google")
	public void user_waits_for_seconds_for_google(Integer int1) throws InterruptedException {
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();  
	}

	

	@Given("user is on Youtube home page {string}")
	public void user_is_on_Youtube_home_page(String arg1) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");
	}

	@Given("user waits for {int} seconds for Youtube")
	public void user_waits_for_seconds_for_Youtube(Integer int1) throws InterruptedException {
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();  
	}
	
	@Given("user is on Facebook home page {string}")
	public void user_is_on_Facebook_home_page(String arg1) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");
	}

	@Given("user waits for {int} seconds for Facebook")
	public void user_waits_for_seconds_for_Facebook(Integer int1) throws InterruptedException {
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();  
	}
	
}
