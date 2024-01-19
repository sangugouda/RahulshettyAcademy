package BasicScriptCreationsIMP;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximize");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot shot = (TakesScreenshot)driver;
	File scr =	shot.getScreenshotAs(OutputType.FILE);
	 // FileUtiles.copyFile(scr,"C:\\Users\\User\\Selenium ScreenShot");
		
	
		

	}

}
