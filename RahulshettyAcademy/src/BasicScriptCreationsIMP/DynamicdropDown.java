package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicdropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver ();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
driver.findElement(By.className("paxinfo")).click();

/*for(int i=1; i<=6;i++) {
driver.findElement(By.id("hrefIncAdt")).click();
	}
	*/
System.out.println(driver.findElement(By.className("paxinfo")).getText());
int i = 1;
while(i<=6)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
}
System.out.println(driver.findElement(By.className("paxinfo")).getText());
driver.close();
}
	}
	
