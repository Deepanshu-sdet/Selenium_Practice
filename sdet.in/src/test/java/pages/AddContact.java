package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Locators.Locators;

public class AddContact extends Locators{
	
	public AddContact(){
		
	}
	
	public void addContact(WebDriver driver) {
		driver.findElement(By.xpath(addContactButton)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(fname)).click();
		driver.findElement(By.xpath(fname)).sendKeys("Saket");
		driver.findElement(By.xpath(lname)).click();
		driver.findElement(By.xpath(lname)).sendKeys("Gokhle");
		driver.findElement(By.xpath(dob)).click();
		driver.findElement(By.xpath(dob)).sendKeys("2024-12-11");;
		driver.findElement(By.xpath(email)).click();
		driver.findElement(By.xpath(email)).sendKeys("s@email.com");
		driver.findElement(By.xpath(phone)).click();
		driver.findElement(By.xpath(phone)).sendKeys("1291112911");
		driver.findElement(By.xpath(street1)).click();
		driver.findElement(By.xpath(street1)).sendKeys("Street1");
		driver.findElement(By.xpath(street2)).click();
		driver.findElement(By.xpath(street2)).sendKeys("Evolve");
		driver.findElement(By.xpath(city)).click();
		driver.findElement(By.xpath(city)).sendKeys("Pune");
		driver.findElement(By.xpath(state)).click();
		driver.findElement(By.xpath(state)).sendKeys("Maharastra");
		driver.findElement(By.xpath(postalCode)).click();
		driver.findElement(By.xpath(postalCode)).sendKeys("123456");
		driver.findElement(By.xpath(country)).click();
		driver.findElement(By.xpath(country)).sendKeys("India");
		driver.findElement(By.xpath(submitButton)).click();
	}
}
