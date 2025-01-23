package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locators.Locators;

public class SignupPage extends Locators{
	
	public SignupPage() {
		
	}
	
	
	public AddContact signup(WebDriver driver) {
		
		driver.findElement(By.xpath(username)).click();
		driver.findElement(By.xpath(username)).sendKeys("usersaket@mail.com");
		driver.findElement(By.xpath(password)).click();
		driver.findElement(By.xpath(password)).sendKeys("user1234");
		driver.findElement(By.xpath(submitButton)).click();

		
		return new AddContact();
	}
	
}
