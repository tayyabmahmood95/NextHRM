package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Report {

	public WebDriver driver;
	By Report1 = By.xpath("//*[@id=\"REPORTS_href\"]");
	By FromDate = By.xpath("//*[@id=\"fromDate\"]");
	By ToDate = By.xpath("//*[@id=\"toDate\"]");
	By Search = By.xpath("//*[@id=\"submit\"]");
	By Export = By.xpath("//*[@id=\"filterForm\"]/div/div/div[2]/input[2]");
	
	public Report (WebDriver driver) {
		
		
		this.driver = driver;
	}
	
	
	public void Report1() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"REPORTS_href\"]")));
		
		driver.findElement(Report1).click();
		
	}
	
	public void FromDate (String FromDate1) {
		
		driver.findElement(FromDate).click();
		WebElement FromDateElement=driver.findElement(FromDate);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", FromDateElement);
		driver.findElement(FromDate).clear();
		driver.findElement(FromDate).sendKeys(FromDate1);
		
	}
	
	public void ToDate (String ToDate1) {
		driver.findElement(ToDate).click();
		WebElement ToDateElement=driver.findElement(ToDate);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", ToDateElement);
		driver.findElement(ToDate).clear();
		driver.findElement(ToDate).sendKeys(ToDate1);
		
	}
	
	public void search () {
		
		driver.findElement(Search).click();
	}
	
	public void Export () {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"filterForm\"]/div/div/div[2]/input[2]")));
	driver.findElement(Export).click();	
		
		
	}
}
