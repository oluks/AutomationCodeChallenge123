package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationCodeChallengeScenario1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/");
		driver.navigate().to("http://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
		String FirstNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/span/i")).getCssValue("color");
		System.out.println("First Name Color is changed to " + FirstNameColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).isDisplayed()) {
			System.out.println("Please supply your first name is displayed");
		} else {
			System.out.println("Please supply your first name is not displayed");
		}
		String LastNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/label")).getCssValue("color");
		System.out.println("Last Name Color is changed to " + LastNameColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).isDisplayed()) {
			System.out.println("Please supply your last name is displayed");
		} else {
			System.out.println("Please supply your last name is not displayed");
		}String EmailColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Email Color is changed to " + EmailColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")).isDisplayed()) {
			System.out.println("Please supply your email address is displayed");
		} else {
			System.out.println("Please supply your email address is not displayed");

		}String PhoneNumberColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Phone number color is changed to " + PhoneNumberColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/label")).isDisplayed()) {
			System.out.println("Please supply your phone number is displayed");
		} else {
			System.out.println("Please supply your phone number is not displayed");
		}String AddressColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/label")).getCssValue("color");
		System.out.println("Address color is changed to " + AddressColor);

		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).isDisplayed()) {
			System.out.println("Please supply your street address is displayed");
		} else {
			System.out.println("Please supply your street address is not displayed");
		}String CityColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/label")).getCssValue("color");
		System.out.println("City color is changed to " + CityColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).isDisplayed()) {
			System.out.println("Please supply your city is displayed");
		} else {
			System.out.println("Please supply your city is not displayed");
		}String StateColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/label")).getCssValue("color");
		System.out.println("State color is changed to " + StateColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/small")).isDisplayed()) {
			System.out.println("Please supply your state is displayed");
		} else {
			System.out.println("Please supply your state is not displayed");
		}String ZipCodeColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/label")).getCssValue("color");
		System.out.println("Zipcode color is changed to " + ZipCodeColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/label")).isDisplayed()) {
			System.out.println("Please supply your zip code is displayed");
		} else {
			System.out.println("Please supply your zip code is not displayed");
		}String ProjectDescriptionColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/label")).getCssValue("color");
		System.out.println("Project description color is changed to " + ProjectDescriptionColor);
		if (driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")).isDisplayed()) {
			System.out.println("Please supply a description of your project is displayed");
		} else {
			System.out.println("Please supply a description of your project is not displayed");
		}
		
	}

}