package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/..
		// //button[text()='ADD TO CART']")).click();
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < productName.size(); i++) {
			String name = productName.get(i).getText();
			if(name.contains("Potato")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
				
			}
		}
		driver.close();

	}

}
