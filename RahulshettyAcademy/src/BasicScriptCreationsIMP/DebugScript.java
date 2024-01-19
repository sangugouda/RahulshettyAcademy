package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DebugScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\firfox\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Assert.assertTrue(driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-logo'])[1]")).isDisplayed());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Raksha");
		driver.findElement(By.xpath("(//button[@class='style-scope ytd-searchbox'])[2]")).click();
		
	}

}
