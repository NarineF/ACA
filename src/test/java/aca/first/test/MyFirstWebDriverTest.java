package aca.first.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.GmailConstants;
import pages.login.LoginPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstWebDriverTest {

	WebDriver driver;
	private String gmailUrl = GmailConstants.GMAIL_URL;
	
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
		this.driver.get(gmailUrl);
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

		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		// verify gmail Logo is Present
		Assert.assertTrue(login.isLogoVisible());
		Thread.sleep(3000);
		// click Next button
		
		//es mas@ toxnum em dzez, vor taneq constants u page object-ov sarqeq
		//ete xndirner arajanan, greq  :)  lav
		//@ntacik harcer kan?
		//pastoren const popox-ner@ declare enq anum final? const in java  = final ok
		//ed init elements@ dzez der piti petq ga, vorovhetev amen angam nor element vor haytnvi ejum, petq a init anenq 
		//ed mas@ uzum em porceq, tesneq vor aranc dra chi gna
		// lav mi qich kkardam hesa ed mas@
		//isk es karogh em che github-ic es erku versianer@ unenam u hamematem popoxutyunner@ 
		//hesa es verjin popoxutyunnerov branch sarqenq, gcenq github, vor erb petq lini, hamemateq
		
//		driver.findElement(By.xpath("//input[@id='next']")).click();
		Thread.sleep(2000);
		// verify Enter an email or phone number error message is displayed
//		Assert.assertTrue(driver.findElement(By.xpath(
//				"//span[@id='errormsg_0_Email' and contains(text(), 'Enter an email or phone number')]")) != null);

	}

	@AfterClass
	private void cleanUP() {
		driver.close();
		driver.quit();
	}
	//da nshanakum a, vor project config-um arden grac a ed directory-n, vorpes source directory
	//menq uxxaki ksarqenq hamapatasxan folderner@ windows explorer-um

	//en vandakadzev nshan@ papkayi vra nshanakum a, vor inq@ source directory a, aysinqn java-n iran vorpes package chi kardum
	//iranic ners exac bolor package-nern arden hamarvelu en java package ok
}
