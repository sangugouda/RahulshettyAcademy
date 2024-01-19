package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleIteamsToCart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String[] iteamsNeedToAddCart = { "Fiction", "Computing and Internet" };
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Books")).click();
		List<WebElement> books = driver.findElements(By.xpath("//h2"));
		for (int i = 0; i < books.size(); i++) {
			String bookName = books.get(i).getText().trim();
			System.out.println(bookName);
             //converting Array to Arraylist
			List iteams = Arrays.asList(iteamsNeedToAddCart);
			if (iteams.contains(bookName)) {
				driver.findElements(By.xpath("//input[@value='Add to cart']")).get(i).click();
				Thread.sleep(15000);
			}

		}

	}

}
