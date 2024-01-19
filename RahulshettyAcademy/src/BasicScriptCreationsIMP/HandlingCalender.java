package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\Microsoft Edge\\\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://www.redbus.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Accept All']")).click();
driver.findElement(By.id("src")).sendKeys("koppal");
driver.findElement(By.id("dest")).sendKeys("bengalore");
driver.findElement(By.id("onward_cal")).click();
// Selecting Month by using for loop
/*for(int i=1;i<10;i++){
	driver.findElement(By.cssSelector("svg#Layer_1")).click();
	if(driver.findElement(By.xpath("//div[@class='sc-csuQGl iFJIRj']/div[2]")).getText().contains("Aug")) {
		break;
	
	}
}*/
// Selecting month by using while loop
while(!driver.findElement(By.xpath("//div[@class='sc-csuQGl iFJIRj']/div[2]")).getText().contains("AUG")) {
	driver.findElement(By.cssSelector("svg#Layer_1")).click();
}
List<WebElement> dates = driver.findElements(By.cssSelector("span.sc-iRbamj.iJCxET"));
for(WebElement date : dates) {
	String actualdate = date.getText();
	if(actualdate.equals("19")) {
		date.click();
		break;
	}
	
}
driver.close();

	}

}
