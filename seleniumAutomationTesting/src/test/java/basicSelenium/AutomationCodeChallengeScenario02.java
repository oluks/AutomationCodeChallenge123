package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationCodeChallengeScenario2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.name("first_name")).sendKeys("David");
		String FirstNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/span/i")).getCssValue("color");
		System.out.println("First Name Color after name input is changed to " + FirstNameColor);
		driver.findElement(By.name("last_name")).sendKeys("Jones");
		String LastNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/label")).getCssValue("color");
		System.out.println("Last Name Color after name input is changed to " + LastNameColor);
		driver.findElement(By.name("email")).sendKeys("Dav1@yahoo.com");
		String EmailColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Email Color after name input is changed to " + EmailColor);
		driver.findElement(By.name("phone")).sendKeys("7458528823");
		String PhoneNumberColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Phone number Color after phone input is changed to " + PhoneNumberColor);
		driver.findElement(By.name("address")).sendKeys("71452 Jones Ave");
		String AddressColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/label")).getCssValue("color");
		System.out.println("Address Color after address input is changed to " + AddressColor);
		driver.findElement(By.name("city")).sendKeys("Boston");
		String CityColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/label")).getCssValue("color");
		System.out.println("City Color after city input is changed to " + CityColor);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[23]")).click();
		String StateColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/label")).getCssValue("color");
		System.out.println("State Color after state selection is changed to " + StateColor);
		driver.findElement(By.name("zip")).sendKeys("02115");
		String ZipCodeColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/label")).getCssValue("color");
		System.out.println("Zipcode Color after zip code input is changed to " + ZipCodeColor);
		driver.findElement(By.name("website")).sendKeys("www.davj.com");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).click();
		driver.findElement(By.name("comment")).sendKeys("Selenium Automation Testing");
		String ProjectDescriptionColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/label")).getCssValue("color");
		System.out.println("Project description Color after project input is changed to " + ProjectDescriptionColor);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
		String NewFirstNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/span/i")).getCssValue("color");
		System.out.println("First Name Color after clicking the send button is now " + NewFirstNameColor);
		String NewLastNameColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/label")).getCssValue("color");
		System.out.println("Last Name Color after clicking send button is now " + NewLastNameColor);
		String NewEmailColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Email Color after clicking send button is now " + NewEmailColor);
		String NewPhoneNumberColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/label")).getCssValue("color");
		System.out.println("Phone number Color after clicking send button is now " + NewPhoneNumberColor);
		String NewAddressColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/label")).getCssValue("color");
		System.out.println("Address Color after clicking send button is now " + NewAddressColor);
		String NewCityColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/label")).getCssValue("color");
		System.out.println("City Color after clicking send button is now " + NewCityColor);
		String NewStateColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/label")).getCssValue("color");
		System.out.println("State Color after clicking send button is now " + NewStateColor);
		String NewZipCodeColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/label")).getCssValue("color");
		System.out.println("Zipcode Color after clicking send button is now " + NewZipCodeColor);
		String NewProjectDescriptionColor = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/label")).getCssValue("color");
		System.out.println("Project description Color after clicking send button is now " + NewProjectDescriptionColor);
		
		
		
		
		
		
		

	}

}
