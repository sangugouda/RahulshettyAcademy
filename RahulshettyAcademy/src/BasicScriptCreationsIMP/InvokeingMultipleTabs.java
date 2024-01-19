package BasicScriptCreationsIMP;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeingMultipleTabs {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windows = new  ArrayList<String>();
		Iterator<String> it = allWindows.iterator();
	/*	for(int i=0;i<allWindows.size();i++) {
			windows = it.next();
			
			
		}*/
		String ParentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String course = driver.findElement(By.xpath("//div[@id='courses-block']//a")).getAttribute("href");
		driver.switchTo().window(ParentWindow);
		WebElement name= driver.findElement(By.name("name"));
		driver.findElement(By.name("name")).sendKeys(course);
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Gouda.png"));
		System.out.println(name.getRect().getDimension().height);
		

	}

}
