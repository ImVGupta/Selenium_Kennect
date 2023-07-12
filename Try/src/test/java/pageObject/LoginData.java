package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginData {
	
	WebDriver ldriver;
	
	public LoginData(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	WebElement lusername;
	
	@FindBy(name="password")
	WebElement lpassword;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginbtn;
	
	public void setUser(String str) {
		lusername.sendKeys(str);
	}
	
	public void setpas(String pass) {
		lpassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginbtn.click();
	}

}
