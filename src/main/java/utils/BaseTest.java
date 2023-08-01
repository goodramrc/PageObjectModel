package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
	
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); //maximizeaza fereastra browserului
		driver.get("https://keybooks.ro/");
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(4000); //bad practice
//		driver.quit(); //inchide tot browserul cu toate taburile
	
	}

}
