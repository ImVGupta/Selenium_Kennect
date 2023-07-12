package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCostCalculator {
	
WebDriver ldriver;
	
	public TestCostCalculator(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="patient-test")
	WebElement testtype;
	
	
	
	public void test(String bloodTest) {
		testtype.sendKeys(bloodTest);
	}
	
	public void add() {
		testtype.sendKeys(Keys.ENTER);
	}
	

}
