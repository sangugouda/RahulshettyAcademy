package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSujjectedDropdown {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("kol");
		Thread.sleep(5000);
	List<WebElement> From	= driver.findElements(By.xpath("//div[@class='pushRight font14 lightGreyText latoBold']"));
	//System.out.println(From);

	  for( WebElement cityName : From) {
		  if (cityName.getText().equalsIgnoreCase("CGN")){
			  cityName.click();
			  break;
			  
		  }
		  
	  }
	  
	 List<WebElement> To = driver.findElements(By.xpath("//p[@class ='font14 appendBottom5 blackText']"));
	 for(WebElement cityname : To) {
		 if(cityname.getText().equalsIgnoreCase("goa, India")) {
			 cityname.click();
			 break; 
		 }
	 }
		System.out.println(driver.findElements(By.xpath("//ul[@class='specialFareNew']/li")).size());
	}
}


