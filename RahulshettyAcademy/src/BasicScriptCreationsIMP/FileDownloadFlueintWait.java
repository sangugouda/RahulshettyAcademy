package BasicScriptCreationsIMP;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


public class FileDownloadFlueintWait {
public static void main(String [] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://getsamplefiles.com/sample-video-files/mkv");
	driver.manage().window().maximize();
	JavascriptExecutor execute = (JavascriptExecutor) driver;
	WebElement	Ele= driver.findElement(By.xpath("//a[@href='https://getsamplefiles.com/download/mkv/sample-1.mkv']"));
	execute.executeScript("arguments[0].scrollIntoView();", Ele);
	Ele.click();
	
	String fileDownLoadPath = "\"C:\\Users\\User\\Downloads\"";
	String downloadingFileName = "sample-1";
	
	File file = new File(fileDownLoadPath,downloadingFileName);
	
	FluentWait<File> wait = new FluentWait <File>(file)
			.withTimeout(Duration.ofMinutes(1))
			.pollingEvery(Duration.ofSeconds(2));
		
	
	
}
}
