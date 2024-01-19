package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignement6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions action = new Actions(driver);
		WebElement suggestionTextField = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		suggestionTextField.sendKeys("co");
	//	action.moveToElement(suggestionTextField).click().sendKeys("co").build().perform();
		suggestionTextField.sendKeys(Keys.ARROW_DOWN);
		suggestionTextField.sendKeys(Keys.ARROW_DOWN);
		System.out.println(suggestionTextField.getAttribute("value"));
/*		
	List<WebElement> cities = driver.findElements(By.xpath("//ul[contains(@class,' ui-autocomplete ui-front')]//li"));
//	System.out.println(cities);
	/*     For Move hover on each city in auto suggestion dropdown by using mouse
    for(WebElement city : cities) { 
    
    action.moveToElement(city).build().perform();
    
    Thread.sleep(3000);
    	
    } */
	
	//  for move hover on each city in auto suggestion dropdown by using down arrow key
	
	
	
	}
}


