package seleniumScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	WebDriver driver;
	public static void main(String[] args) {
		LaunchBrowser lb = new LaunchBrowser();
		lb.launchBrowser("chrome");
	}
	
	public void launchBrowser() {
		//chromeDriver to launch chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//FirefoxDriver to launch Firefox
		WebDriver driver1 = new FirefoxDriver();
	}
	
	
	public void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("Unsupported Browser");
		}
		
		driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize().getHeight());
	System.out.println(driver.manage().window().getSize().getWidth());
	
	driver.get("https://www.selenium.dev/");
	driver.manage().window().minimize();
//	Dimension d = new Dimension(550, 1000);
//	
//	driver.manage().window().setSize(d);
//	System.out.println(driver.manage().window().getSize());
	
	
	//driver.quit();
	}

}
