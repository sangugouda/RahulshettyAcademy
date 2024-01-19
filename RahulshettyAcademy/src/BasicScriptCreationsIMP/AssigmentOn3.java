package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssigmentOn3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.manage().window().maximize();
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); >> Implicite wait 
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
driver.findElement(By.name("password")).sendKeys("learning");
driver.findElement(By.xpath("//span[text()=' User']")).click();
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button#okayBtn"))));
driver.findElement(By.cssSelector("button#okayBtn")).click();
Select dropdown = new Select(driver.findElement(By.tagName("select")));
dropdown.selectByVisibleText("Consultant");
driver.findElement(By.cssSelector("input#terms")).click();
driver.findElement(By.cssSelector("input#signInBtn")).click();
System.out.println((driver.getTitle()));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link btn btn-primary']")));
// addToCart(driver);
addToCart2(driver);

driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

}
	
	
	// If you need to add selective products only to cart by validating thiere name then use this method
	public static void addToCart(WebDriver driver) {
		String [] iteams = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		// converting Array to Array list
		List formatedArr = Arrays.asList(iteams);
	List <WebElement> mobileTiles= driver.findElements(By.cssSelector("h4.card-title"));
	for(int i=0;i<mobileTiles.size();i++) {
	String actualMobile	= mobileTiles.get(i).getText().trim();
	if(formatedArr.contains(actualMobile)) {
		driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
	}
}
	// // If need to add all products to cart use this  second method
	public static void addToCart2(WebDriver driver) {
	List<WebElement> iteamsToBeAddToCart = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
	for(WebElement iteam: iteamsToBeAddToCart) {
		iteam.click();
		}
	}

}
