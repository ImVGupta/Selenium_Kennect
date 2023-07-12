package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPatient {
	
	WebDriver ldriver;
	
	public AddPatient(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[text()='Patients']")
	WebElement patientsBar;
	
	@FindBy(xpath = "(//*[text()='Add Patient'])[1]")
	WebElement addpatients;
	
	@FindBy(name = "name")
	WebElement addName;
	
	@FindBy(name = "email")
	WebElement addEmail;
	
	@FindBy(name = "phone")
	WebElement addphone;
	
	@FindBy(xpath = "(//*[text()='General Details'])[2]")
	WebElement nextPage;
	
	@FindBy(name = "height")
	WebElement addHeight;
	
	@FindBy(name = "weight")
	WebElement addWeight;
	
	@FindBy(id = "mui-component-select-gender")
	WebElement addGender;
	
	@FindBy(name = "age")
	WebElement addAge;
	
	@FindBy(name = "systolic")
	WebElement addSystoloicBp;
	
	@FindBy(name = "diastolic")
	WebElement addDiastolicBp;
	
	@FindBy(xpath = "(//*[text()='Add Tests'])[2]")
	WebElement next;
	
	@FindBy(xpath = "(//*[text()='Add Patient'])[2]")
	WebElement finallyAdd;
	
	public void gotoAdd() {
		patientsBar.click();;
	}
	
	public void clickOnaddPatients() {
		addpatients.click();
	}
	
	public void patientName(String str) {
		addName.sendKeys(str);
	}
	
	public void patientEmail(String str) {
		addEmail.sendKeys(str);
	}
	
	public void patientPhonr(String str) {
		addphone.sendKeys(str);
	}
	
	public void secondPage() {
		nextPage.click();
	}
	
	public void patienHeight(String str) {
		addHeight.sendKeys(str);
	}
	
	public void patientWeight(String str) {
		addWeight.sendKeys(str);
	}
	
	public void patientGender(String str) {
		Select dropdown = new Select(addGender);
		dropdown.selectByVisibleText(str);
	}
	
	public void patientAge(String str) {
		addAge.sendKeys(str);
	}
	
	public void patientBP1(String str) {
		addSystoloicBp.sendKeys(str);
	}
	
	public void patientBP2(String str) {
		addDiastolicBp.sendKeys(str);
	}
	
	public void gotoAddtest() {
		next.click();
	}
	
	public void fullyAdd() {
		finallyAdd.click();
	}

}
