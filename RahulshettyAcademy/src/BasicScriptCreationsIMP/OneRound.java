package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OneRound {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();
	List <WebElement> FromCity = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
	for(WebElement option : FromCity) {
		if (option.getText().equalsIgnoreCase("Jaisalmer")) {
			option.click();
			break;
		}
		
	}
	//driver.findElement(By.xpath("//div[text()='To']")).click();
	Thread.sleep(5000);
	List<WebElement> toCityOptions = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
	for(WebElement toCity : toCityOptions) {
		if(toCity.getText().equalsIgnoreCase("Belagavi")) {
			toCity.click();
			break;
		}
	}
	//driver.findElement(By.xpath("//div[text()='Vijayawada']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Return Date']")).isEnabled());
	System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).isEnabled());
	driver.close();
	}

}
