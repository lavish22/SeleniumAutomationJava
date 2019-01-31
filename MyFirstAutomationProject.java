package site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationProject {
	public static void main(String[] args) {
		
		// we need to give path to chromedriver , else we can add it to environment variables
		System.setProperty("webdriver.chrome.driver", "/home/shahzeb/Desktop/folder/tools/chromedriver");
		
		// make a new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//use it to get to desired webpage, makesure you give proper URL unless it will not work
		driver.get("http:\\www.google.com");
		
		//locate the element by it's name or by using any thing else u like
		WebElement webele = driver.findElement(By.name("q"));
		
		//use that element and inject characters into that
		webele.sendKeys("hello selenium");
		
		//hit submit 
		webele.submit();
	}
}
