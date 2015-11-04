package selenium_esting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTesting {

	private WebDriver driver;

	@BeforeClass
	public void Startup() {
		driver = new FirefoxDriver();
	}

	@Test(description = "Google Login")
	public void GoogleLogin() throws Exception {
		System.out.println("Start Here");
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.findElement(By.id("Email")).sendKeys("anantasahu2014@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("Passwd")).sendKeys("ananta30061966");
		driver.findElement(By.id("signIn")).click();
		System.out.println("End Here");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
