package BasicScriptCreationsIMP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\SELENIUM\\\\\\\\\\\\\\\\web drivers\\\\\\\\\\\\\\\\chrome\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		action.moveToElement(searchBox).sendKeys("gouda").doubleClick().build().perform();

	}

}
