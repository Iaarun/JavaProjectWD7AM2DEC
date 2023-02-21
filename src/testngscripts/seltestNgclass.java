package testngscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seltestNgclass {
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@Test(enabled = false)
	public void handlingCalender() {
		// March 30 2024
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		WebElement calInput = driver.findElement(By.xpath("//input[@name='my-date']"));
		calInput.click();
		String calTitle = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/thead/tr[2]/th[2]"))
				.getText();

		System.out.println(calTitle);
		String month = calTitle.split(" ")[0].trim();
		String year = calTitle.split(" ")[1].trim();
		// "2023"+1;
		String nyear = String.valueOf(Integer.parseInt(year) + 1);

		while (!(month.equals("March") && (year.equals(nyear)))) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']"))
					.click();
			calTitle = driver.findElement(By.xpath("//div[@class = 'datepicker-days']/table/thead/tr[2]/th[2]"))
					.getText();
			month = calTitle.split(" ")[0].trim();
			year = calTitle.split(" ")[1].trim();
		}

		driver.findElement(By.xpath("//td[normalize-space()='301']")).click();

	}
	
	@Test
	public void handleMultiplewindows() {
		driver.get("https://www.naukri.com/");
		String mainwindowPage = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		WebElement services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		services.click();
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			if (!id.equals(mainwindowPage)) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}

		driver.switchTo().window(mainwindowPage);
		System.out.println(driver.getCurrentUrl());
	}


}
