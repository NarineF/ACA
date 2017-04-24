package aca.first.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	WebDriver driver;
	public static final String gmailUrl = "http://gmail.com";

	@BeforeClass
	private void initDriver() {
		// we shall set System properties for Chrome Driver Path (of Gecko
		// Driver path for Firefox Driver)
		// System.setProperty("name", "Full Path To chromdriver.exe File");
		// name for Firefox/Geko driver is webdriver.gecko.driver
		// name for Chrome Driver is: webdriver.chrome.dirver

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Narine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	// Steps
	// 1. Open gmail < -done
	// 2. Click on SignIn button
	// Expected resultt
	// After step1. verify gmail page is diplayed by verifying the logo is < -
	// done
	// present
	// After step2. verify error message is displayed

	@Test()
	public void gmailLoginWithEmptyCredentialsTest() throws InterruptedException {

		driver.get(gmailUrl);
		// verify gmail Logo is Present
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'logo-w')]")) != null);
		Thread.sleep(3000);
		// click Next button
		driver.findElement(By.xpath("//input[@id='next']")).click();
		Thread.sleep(2000);
		// verify Enter an email or phone number error message is displayed
		Assert.assertTrue(driver.findElement(By.xpath(
				"//span[@id='errormsg_0_Email' and contains(text(), 'Enter an email or phone number')]")) != null);

	}

	@AfterClass
	private void cleanUP() {
		driver.close();
		driver.quit();
	}

}
