package BasicScriptCreationsIMP;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingExtensionsToChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions option = new ChromeOptions();
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
// started to maximizing browser before invoking
option.addArguments("start-maximized");
// to block the pop-ups
option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
WebDriver driver = new ChromeDriver(option);

/*
option.addExtensions(new File("C:\\Users\\User\\Downloads\\Mobile_Element_Locator_Plugin\\Mobile_Element_Locator_Plugin (1)\\Mobile Locator extension\\scripts"));
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver(option);
*/
driver.get("https://www.amazon.com/");


	}

}
