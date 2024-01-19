package introductionRunningScriptsAllbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\Microsoft Edge\\msedgedriver.exe");
		// invoke browser
		WebDriver driver = new EdgeDriver();
driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.0");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
	}

}
