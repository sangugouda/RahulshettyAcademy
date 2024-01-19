package introductionRunningScriptsAllbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public static void main(String [] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\Microsoft Edge\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
		String pass = parsePassWord(driver);
		System.out.println(pass);
	
		Thread.sleep(5000);
		driver.findElement(By.id("inputUsername")).sendKeys("Jhon");
		Thread.sleep(5000);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(5000);
		driver.close();
		
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
