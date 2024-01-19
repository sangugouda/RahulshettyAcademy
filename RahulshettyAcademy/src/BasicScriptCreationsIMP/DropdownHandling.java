package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
dropdown.selectByVisibleText("AED");
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(5000);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
Thread.sleep(5000);
dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());
driver.close();


}

}
