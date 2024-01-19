
package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignemet2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\firfox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Sanganagouda Gouda");
		driver.findElement(By.name("email")).sendKeys("Gouda@Tyss.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password@123");
		driver.findElement(By.id("exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.xpath("//label[text()='Student']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("03/07/2022");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.close();

	}

}
