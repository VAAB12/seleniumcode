package testngpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class passorfaillogin {
	@Test
	public void incorrectlogin() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			// 3. Initialize Webdriver object through ChromeDriver class.
		     WebDriver browserObject  = new ChromeDriver();
		  System.out.println("Performing Login and wait for 2 seconds");
		   // 5. Open login page of https://admin-demo.nopcommerce.com/login
	       browserObject .get("https://admin-demo.nopcommerce.com/login");
		   // 6. Get reference of Email input box by locate the id method.
	       WebElement username = browserObject .findElement(By.name("Email"));
		    // 7. Get reference of Password input box by locate the id method.
	       WebElement password = browserObject .findElement(By.name("Password"));
		    // 8. Get reference of login button by locate the classname method.
	       WebElement submitBtn = browserObject .findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		    // 9. Clear the Email input box.
	       username.clear();
		    // 10. Provide/Enter the correct email to email input box through reference.
	        username.sendKeys("infotech@yourstore.com");
		    // 11. Clear the Password input box.
	       password.clear();
		    // 12. Provide/Enter the correct password to password input box through reference.
	       password.sendKeys("admin");
	       String a="admin@yourstore.com";
		    // 13. Submit the button.
	       submitBtn.click();
	       System.out.println("End Result: Unable to login");
	       assertEquals(username, a);
	       Thread.sleep(2000);
	  }
	
  @Test
  public void loginfunction() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 3. Initialize Webdriver object through ChromeDriver class.
	     WebDriver browserObject  = new ChromeDriver();
	  System.out.println("Performing Login and wait for 2 seconds");
	   // 5. Open login page of https://admin-demo.nopcommerce.com/login
       browserObject .get("https://admin-demo.nopcommerce.com/login");
	   // 6. Get reference of Email input box by locate the id method.
       WebElement username1 = browserObject .findElement(By.name("Email"));
	    // 7. Get reference of Password input box by locate the id method.
       WebElement password1 = browserObject .findElement(By.name("Password"));
	    // 8. Get reference of login button by locate the classname method.
       WebElement submitBtn = browserObject .findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	    // 9. Clear the Email input box.
       username1.clear();
	    // 10. Provide/Enter the correct email to email input box through reference.
       username1.sendKeys("admin@yourstore.com");
	    // 11. Clear the Password input box.
       password1.clear();
	    // 12. Provide/Enter the correct password to password input box through reference.
       password1.sendKeys("admin");
	    // 13. Submit the button.
       submitBtn.click();
       System.out.println("End Result: Form submitted");
       String ba="admin@yourstore.com";
       assertEquals(username1, ba);
       Thread.sleep(2000);
  }
}
