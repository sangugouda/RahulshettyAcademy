package BasicScriptCreationsIMP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingBrokenLinks {
	public static void main(String [] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement fotter	= driver.findElement(By.xpath("//div[contains(@class,' footer')]"));
 // String url = 	fotter.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
	
List <WebElement> links = fotter.findElements(By.tagName("a"));

for(WebElement link : links) {
String url	= link.getAttribute("href");
URL source = new URL(url); 
 HttpURLConnection conn= (HttpURLConnection)source.openConnection();
 conn.connect();
 if(conn.getResponseCode()>=400) {
	System.out.println("The link "+ link.getText()+" is broken the status code is "+conn.getResponseCode());
	 	Assert.assertTrue(false);
	 
 }
	
}



		
	}

}
