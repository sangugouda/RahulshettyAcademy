package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).isSelected());
		driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).isSelected(), "check box is not selected");
		
		driver.close();
		
	}

}
