package pages;

import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	
	public SignupPage entreUrl(WebDriver driver) {
		driver.get("https://thinking-tester-contact-list.herokuapp.com");
		return new SignupPage();
	}
}
