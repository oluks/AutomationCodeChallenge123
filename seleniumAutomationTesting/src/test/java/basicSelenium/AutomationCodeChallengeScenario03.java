package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationCodeChallengeScenario03 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/");
		driver.navigate().to("http://www.seleniumeasy.com/test/table-sort-search-demo.html");
		driver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Vance");
		java.util.List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
		System.out.println("Number of records: " + rowCount.size());
		String LabelInfo = driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		System.out.println("Label on the bottom is: "+ LabelInfo);

	}

}
