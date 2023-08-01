package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//MenuPage menu = new MenuPage(driver);
	
	
	//locatori
	//driver.findElement(By.cssSelector ("....")
	public By contactsLink = By.linkText("CONTACTS");
	public By loginLink = By.cssSelector("li[class='menu_user_login']");
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
}
