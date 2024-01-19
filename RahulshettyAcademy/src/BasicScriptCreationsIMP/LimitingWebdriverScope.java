package BasicScriptCreationsIMP;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LimitingWebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.SHIFT,"down");
	//Find Total links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// found total links in fotter section by limiting diver scope to the fotter
		WebElement fotterdriver = driver.findElement(By.xpath("//div[contains(@class,'navFooterVerticalColumn')]"));
		System.out.println(fotterdriver.findElements(By.tagName("a")).size());
		// found total count of links in 1 column of fotter section, by doing again limiting diver scope
		WebElement column1= fotterdriver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		List<WebElement> links = column1.findElements(By.tagName("a"));
		for(WebElement link: links) {
			link.sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(3000);
			
		}
	Set<String> windows	= driver.getWindowHandles();
	           Iterator<String>it= windows.iterator();
	           while(it.hasNext()) {
	        	   driver.switchTo().window(it.next());
	        	   System.out.println(driver.getTitle());
	        	   System.out.println(driver.getCurrentUrl());
	        	   
	           }
	           
		
	}

}
