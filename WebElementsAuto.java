package SeleniumAutomationJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsAuto {
	public void Buttons() {
		System.setProperty("webdriver.chrome.driver","/home/shahzeb/Desktop/folder/tools/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/shahzeb/eclipse-workspace/AutomationFiles/src/useme.html");	//it's importatant to include file in the beginning
		
		WebElement radio = driver.findElements(By.name("gender")).get(1);
		radio.click();
		WebElement check = driver.findElement(By.id("validation3"));
		check.click();
		
		Select options = new Select( driver.findElement(By.id("select1")) ); 		// takes in webElement as an argument
		options.selectByVisibleText("reptile");
	}
}
  /*
useme.html ---->

<body>
<form>
	<input type="radio" name="gender" value="M">Male
	<input type="radio" name="gender" value="F">Female
	<input type="radio" name="gender" value="O">Other
</form>

<br>

<form>
	<input type="checkbox" id="validation1" value="adult" >above 18
	<input type="checkbox" id="validation2" value="literate">high school pass
	<input type="checkbox" id="validation3" value="PWD">PWD 
</form>

<br>

<select id="select1">
	<option value="cats">cats</option>
	<option value="dogs">dogs</option>
	<option value="reptile">reptile</option>
	<option value="other">other</option>
</select>
</body>

*/