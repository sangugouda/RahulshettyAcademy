package introductionRunningScriptsAllbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class LocatorsPractics {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\Microsoft Edge\\\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Gouda");
	driver.findElement(By.name("inputPassword")).sendKeys("Goudru");
	driver.findElement(By.className("submit")).click();
	System.out.println(driver.findElement(By.className("error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Jhon");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("RahulShettyAcademy@gmail.com");
	driver.findElement(By.className("reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.xpath("(//p)[1]")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//h1[text()='Sign in']/..//input[@id='inputUsername']")).sendKeys("Jhon");
	driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys(parsePassWord(driver));
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
}
static String parsePassWord(WebDriver driver) throws InterruptedException {
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
	String password = driver.findElement(By.xpath("//p[contains(text(),'Please ')]")).getText();
	driver.findElement(By.className("go-to-login-btn")).click();
String [] passwordArray	= password.split("'");
String [] actualPassword = passwordArray[1].split("'");
String updatedPassword = actualPassword[0];
return updatedPassword;


	//Please use temporary password 'rahulshettyacademy' to Login.
	
	
}
}
 