package BasicScriptCreationsIMP;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HqandlingscrollinWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String[] tableHeaders = { "Name", "Position", "City", "Amount" };
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=400");
		List actualHeaders = Arrays.asList(tableHeaders);
		/*
		 * List<WebElement> tableHeading =
		 * driver.findElements(By.xpath("//div[@class='tableFixHead']//th"));
		 * System.out.println(tableHeading.size()); // Validating the table headers for
		 * (WebElement header : tableHeading) { // System.out.println(header.getText());
		 * if (actualHeaders.contains(header.getText())) {
		 * System.out.println(header.getText()); } }
		 */
		int sum = 0;
		List<WebElement> column4Data = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		for (int i = 0; i < column4Data.size(); i++) {
			// System.out.println(column4Data.get(i).getText());
			int ammount = Integer.parseInt(column4Data.get(i).getText());
			sum = sum + ammount;
			
		}
		System.out.println(sum);
	String [] arr	= driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":");
  int ammount = Integer.parseInt(arr[1].trim());
  Assert.assertEquals(sum, ammount);
  driver.close();

		

	}

}
