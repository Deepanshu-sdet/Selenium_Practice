import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddContact;
import pages.LandingPage;
import pages.SignupPage;

public class TestClass {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// Navigate to landing page
		LandingPage landpage=  new LandingPage();
		SignupPage signupPage=landpage.entreUrl(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AddContact add=signupPage.signup(driver);
		add.addContact(driver);
		
		
		
	}
}
