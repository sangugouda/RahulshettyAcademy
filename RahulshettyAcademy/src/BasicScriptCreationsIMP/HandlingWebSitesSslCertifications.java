package BasicScriptCreationsIMP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingWebSitesSslCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions option = new FirefoxOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\firfox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(option);
	/*	ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(option);
		 */
		// For Microsoft edge browser
	/*	EdgeOptions option = new EdgeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(option); 
	*/
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

	}

}
