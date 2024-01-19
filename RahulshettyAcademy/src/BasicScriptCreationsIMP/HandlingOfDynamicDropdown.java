package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingOfDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\Microsoft Edge\\\\\\\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.findElement(By.xpath("//div[text()='From']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Delhi']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Goa']")).click();
	
	}

}
