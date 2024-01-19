package BasicScriptCreationsIMP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assigment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isDisplayed());
		driver.findElement(By.id("checkBoxOption3")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption3")).isSelected());
		String selectedCheckbox = driver.findElement(By.xpath("//label[@for='honda']")).getText().trim();
		System.out.println(selectedCheckbox);
		Select dropDown = new Select(
				driver.findElement(By.xpath("//select[contains(@name,'dropdown-class-example')]")));
		dropDown.selectByVisibleText(selectedCheckbox);
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys(selectedCheckbox);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		Assert.assertTrue(alertText.contains(selectedCheckbox));
		driver.switchTo().alert().accept();
		driver.close();

	}

}
