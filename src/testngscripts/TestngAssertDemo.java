package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(MyTestListener.class)
public class TestngAssertDemo {
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://live.techpanda.org/");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void titleverification() {
		String expectedtitle = "THIS IS DEMO SITE FOR ";
		String actualtitle = driver.findElement(By.xpath("//h2[1]")).getText();
		
	//	Assert.assertEquals(actualtitle, expectedtitle);
		Assert.assertTrue(actualtitle.contains(expectedtitle));
	}
	
	@Test
	public void softassertitleverification() {
		SoftAssert softassert = new SoftAssert();
		
		String expectedtitle = "THIS IS DEMO SITE FOR ";
		String actualtitle = driver.findElement(By.xpath("//h2[1]")).getText();
		
		softassert.assertEquals(actualtitle, expectedtitle);
	//	softassert.assertTrue(actualtitle.contains(expectedtitle));
		softassert.assertAll();
	}
}
