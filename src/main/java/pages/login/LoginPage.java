package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.GmailConstants;

public class LoginPage {
	
	//es hardcode xpath@ tanenq constants class
	WebDriver driver;
	
	private final String logoXpath = GmailConstants.LOGO_XPATH;
		
	@FindBy(xpath=logoXpath)
	WebElement logo;
	
	
	
	//driver.get-@ piti durs hanenq, qani vor Page object@ sarqvum a minchev get linel@, hetevabar bolor elementner@ null en linum
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		//elementnern initilize anenq
		PageFactory.initElements(driver, this);
		
		
	}
	public boolean isLogoVisible(){
		return this.logo.isDisplayed();
	}

	//es mas@ vonc a?pastoren estegh vonc vor amen inch@ veracum enq methodneri? AYO, shat chisht eq
	//ed mer Login Page-@ darnum a object, vori amen elementin arden OOP lezvov enq motenum, aysinqn methodnerov  parz a es comment@ chjnjeq) ok
	
}
