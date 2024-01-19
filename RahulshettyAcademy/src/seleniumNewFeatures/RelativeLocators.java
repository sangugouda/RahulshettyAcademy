package seleniumNewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
// Need to do for above,below,right,left methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement emailTextField = driver.findElement(By.xpath("//input[@id='ap_email']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label"))).getText());

	}

}
