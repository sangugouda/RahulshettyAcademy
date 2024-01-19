package BasicScriptCreationsIMP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\firfox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[text()='Login']")).getText());
		driver.close();

	}

}
