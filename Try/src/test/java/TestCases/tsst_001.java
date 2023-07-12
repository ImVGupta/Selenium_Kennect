package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObject.AddPatient;
import pageObject.BaseType;
import pageObject.LoginData;
import pageObject.TestCostCalculator;

public class tsst_001 extends BaseType{
	
	@Test
	public void open() throws InterruptedException {
		driver.get(url);
		Thread.sleep(4000);
		LoginData ld = new LoginData(driver);
		ld.setUser(username);
		ld.setpas(password);
		ld.clickLogin();
		Thread.sleep(4000);
		
//		blood test
		TestCostCalculator tcc = new TestCostCalculator(driver);
		tcc.test("vitamin d");
		Thread.sleep(4000);
		tcc.add();
		Thread.sleep(4000);
		
//		test to add patients
		AddPatient ap = new AddPatient(driver);
		ap.gotoAdd();
		ap.clickOnaddPatients();
		ap.patientName(name);
		ap.patientEmail(email);
		ap.patientPhonr(pn);
		ap.secondPage();
		ap.patienHeight(height);
		ap.patientWeight(weight);
		ap.patientGender(gender);
		ap.patientAge(age);
		ap.patientBP1(systolic);
		ap.patientBP2(distobolic);
		ap.gotoAddtest();
//		to go to bottom of webPage
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,250)", "");
		ap.fullyAdd();
	}

}
