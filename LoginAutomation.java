import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAutomation {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","/home/shahzeb/Desktop/folder/tools/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/home/shahzeb/Desktop/folder/tools/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.way2sms.com/");

		WebElement way2smslink = driver.findElement(By.id("mobileNo"));
		way2smslink.sendKeys("1234567890"); // type in your mobile number
		try {
			Thread.sleep(9000); // by the time this wakes up, type your password*do not press ENTER*
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("password")).sendKeys(Keys.RETURN);
	}

}
