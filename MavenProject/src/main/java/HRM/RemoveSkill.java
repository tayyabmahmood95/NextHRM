package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveSkill {
	
	public WebDriver driver;
	By Remove = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[5]/a");	
	By Save = By.xpath("//*[@id=\"skillSave\"]");
		
		public RemoveSkill(WebDriver driver) {
			
			this.driver = driver;
	}
	
		public void Remove () {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[5]/a")));
			driver.findElement(Remove).click();
			driver.switchTo().alert().accept();
		}
		
		public void Save () {
			
			driver.findElement(Save).click();
		}

}
