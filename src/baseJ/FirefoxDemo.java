package baseJ;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.getProperty("webdriver.gecko.driver", "C:\\Users\\dbc\\git\\updated\\lowes_desktop_tablet\\drivers\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dbc\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://dev0015.d.lowes.com/");
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dbc\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\dbc\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.co.in/");
		
		

	}

}
