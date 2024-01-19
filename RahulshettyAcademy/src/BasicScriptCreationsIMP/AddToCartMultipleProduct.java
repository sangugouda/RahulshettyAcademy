package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddToCartMultipleProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] productNames = { "Brocolli", "Cucumber","Tomato" };
		
		addToCart(driver,productNames);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("(//div[@class='action-block'])[1]/button")).click();
		driver.findElement(By.className("promoCode")).sendKeys("RahulShetty");
		driver.findElement(By.className("promoBtn")).click();
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Invalid code ..!");
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		driver.findElement(By.className("promoCode")).clear();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();   
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
		
		}
		 

	
	
	
	public static void addToCart(WebDriver driver,String[]productNames) {
		List<WebElement> productAdress = driver.findElements(By.xpath("//h4"));
		int j = 0;
		for (int i = 0; i < productAdress.size(); i++) {
			String productName = productAdress.get(i).getText();
			String[] arr = productName.split("-");
			String actualProductName = arr[0].trim();
			// Converting array to arraylist
			List iteamsNeededToAddCart = Arrays.asList(productNames);
			if (iteamsNeededToAddCart.contains(actualProductName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				System.out.println(actualProductName);
				if (j == productNames.length) {
					break;
				}
			}
			
	}
	}
	}
