package BasicScriptCreationsIMP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" 	");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		// No.of Rows in table
	List<WebElement> rows= driver.findElements(By.xpath("//table[@class='table-display']//tr"));
	System.out.println(rows.size());
	List <WebElement> column = driver.findElements(By.xpath("//table[@class='table-display']//th"));
	System.out.println(column.size());
	System.out.println(driver.findElement(By.xpath("//table[@class='table-display']//tr[3]")).getText());
		/*int Sum =0;
		 List <WebElement> table = driver.findElements(By.xpath("//table[@class='table-display']//td[3]"));
		 for(WebElement data : table ) {
			int ammount =Integer.parseInt(data.getText());
			Sum= Sum + ammount;
			 
		 }
		 System.out.println(Sum); */
	}

}
