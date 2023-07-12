package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseType {
	
	public String url = "https://gor-pathology.web.app/";
	public String username = "test@kennect.io";
	public String password = "Qwerty@1234";
	public String name = "Aman";
	public String email = "aman@gmail.com";
	public String pn = "4657934628";
	public String height = "180";
	public String weight = "63";
	public String gender = "Male";
	public String age = "45";
	public String systolic = "123";
	public String distobolic = "67";
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
