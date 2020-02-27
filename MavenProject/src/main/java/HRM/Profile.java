package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile {

	public WebDriver driver;

	By Profile = By.xpath("//*[@id=\"body\"]/div/div/div[1]/div[1]/div[3]/a/div/div/div[1]");
	By Qualification = By.xpath("//*[@id=\"headingThree\"]/h4/a/i");
	
	
	public Profile (WebDriver driver) {
		this.driver = driver;
		}
	
public void ProfileCLick() {
	
	driver.findElement(Profile).click();
}

public void Qualification () {
	
	driver.findElement(Qualification).click();
	WebDriverWait wait1 = new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[4]/a")));	
}

}
