package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver intilizeBrowser(String browserName) {
		
		
		
		if(browserName.equals("chrome")) {
			
			 driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}
		return driver;
		
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}

}
