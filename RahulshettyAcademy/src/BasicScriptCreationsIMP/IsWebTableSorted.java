package BasicScriptCreationsIMP;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class IsWebTableSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\Edge driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		
		
	//	driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
	//	List<WebElement> veg = driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody//td[1]"));
	/*	List<String> originalList = new ArrayList<String>();
		for(WebElement vegtable: veg) {
		    String  names = vegtable.getText();
			originalList.add(names);
			
		}
		*/ 
		// commented code part can be done in other way as well, that demonstrated below
	/*    List<String> originalList = veg.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList)); 
		*/
		
		// Get price value of vegitable Beans
	List<WebElement> veggies	= driver.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr//td[1]"));
	
	// by using stream concept
	List<String> price = veggies.stream().filter(s->s.getText().contains("Beans")).map(s->veggiePrice(s)).collect(Collectors.toList());
	price.forEach(s->System.out.println(s));
	// by using for each loop
	/*for(WebElement vegetable: veggies) {
		if(vegetable.getText().equalsIgnoreCase("beans")) {
			System.out.println(vegetable.findElement(By.xpath("following-sibling::td[1]")).getText());
			
		} 
// by using for loop
	for(int i=0;i<veggies.size();i++) {
		
		if(veggies.get(i).getText().equalsIgnoreCase("beans")) {
			System.out.println(veggies.get(i).findElement(By.xpath("following-sibling::td[1]")).getText());
		}
		*/
	
	}
	static String veggiePrice(WebElement s) {
	String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	 return price; 
		
		
	}
		
	}


