package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PagenationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\Edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		
		List<String> price;
		// using do while loop due to pagination concept
	do {	
		List<WebElement> veggies2 = driver
				.findElements(By.xpath("//table[@class='table table-bordered']//tbody//td[1]"));
		price= veggies2.stream().filter(s->s.getText().contains("Rice")).map(veg->getPrice(veg)).collect(Collectors.toList());
		
		if(price.size()==0) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			
		}
	}while(price.size()==0);
		
		System.out.println(price);
	}
	static String getPrice(WebElement veg) {
		String price = veg.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
		
	}

}
