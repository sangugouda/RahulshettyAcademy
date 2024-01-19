package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlinkoName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\firfox\\geckodriver.exe");
WebDriver driver = new  FirefoxDriver();
driver.get("https://app.flinko.com/signin");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("emailId")).sendKeys("rabej64030@steamoh.com");
driver.findElement(By.name("password")).sendKeys("Password@123");
driver.findElement(By.tagName("button")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(" //label[text()='All Projects']")).click();
driver.findElement(By.xpath("(//span[text()='Integration'])[1]")).click();
System.out.println(driver.getTitle());
driver.close();
	}

}
