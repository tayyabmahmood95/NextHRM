package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

	public WebDriver driver;
	By Logout = By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/div/a[2]");
	
	
	public Logout (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void Logout1 () {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/div/a[2]")));
		driver.findElement(Logout).click();
	}
}
