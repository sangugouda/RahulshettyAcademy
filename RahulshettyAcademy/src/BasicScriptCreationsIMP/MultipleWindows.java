package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\SELENIUM\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\web drivers\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chrome\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println((driver.findElement(By.xpath("//p[@class='im-para red']")).getText()));
	//	String[] arr = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("");
		String userName = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(userName);

		/*
		 * for( String text : arr) { if(text.equals("mentor@rahulshettyacademy.com")) {
		 * String userName = text; System.out.println(text);
		 * driver.switchTo().window(parentWindow);
		 * driver.findElement(By.id("username")).sendKeys(text); break; }
		 * 
		 * } driver.findElement(By.id("password")).sendKeys("Gouda");
		 */

		/*
		 * System.out.println(driver.getWindowHandles()); for (String window : windows)
		 * { System.out.println(window); }
		 */
	}

}
