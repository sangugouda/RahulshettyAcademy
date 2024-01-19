package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assignement1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	//	Assert.assertEquals("driver.findElements(By.xpath(\"//input[@type='checkbox']\")).size()", "3");
		driver.close();
	
	}

}
