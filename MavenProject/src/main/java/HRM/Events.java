package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events {

public WebDriver driver;
	
	By EventClick=By.xpath("//*[@id=\"EVENTS_href\"]");
	By NewClick = By.xpath("//*[@id=\"body\"]/div/div/div/div/div[2]/div/div/a[1]");
	By NameClick = By.id("name");
	By StartDate= By.name("dailyReminderStart");
	By Save = By.xpath("//*[@id=\"filterForm\"]/div/div/div[4]/div[6]/div/div/input");
	By Edit = By.xpath("//*[@id=\"body\"]/div/div/div/div/div[3]/table/tbody/tr/td[7]/a[1]");
	By ReminderTime1 = By.xpath("//*[@id=\"dateRowDaily\"]/div/div/button/span[1]");
	By Hour = By.xpath("//*[@id=\"dateRowDaily\"]/div/div/div/ul/li[2]/a");
	By Save1 = By.xpath("//*[@id=\"filterForm\"]/div/div/div[4]/div[6]/div/div/input");
	By Delete = By.xpath("//*[@id=\"body\"]/div/div/div/div/div[3]/table/tbody/tr/td[7]/a[2]");
	public Events(WebDriver driver) {
		this.driver = driver;

			}
	public void EventClick() {
		
		driver.findElement(EventClick).click();
	}
	public void NewClick() {
		
		driver.findElement(NewClick).click();
	}

	public void NameClick(String EventName) {
		
		driver.findElement(NameClick).click();
		driver.findElement(NameClick).sendKeys(EventName);
		
	}

	public void StartDate(String EventDate) {
		
		driver.findElement(StartDate).click();
		WebElement StartDateElement=driver.findElement(StartDate);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", StartDateElement);
				driver.findElement(StartDate).clear();
				driver.findElement(StartDate).sendKeys(EventDate);
	}

	public void Save () {
		
		driver.findElement(Save).click();
	}
			
	public void Edit () {
		
		driver.findElement(Edit).click();
	}
	public void ReminderTime1() {
		
		driver.findElement(ReminderTime1).click();
	}
	public void Hour () {
		
		driver.findElement(Hour).click();
	}

	public void Save1() {
		
		driver.findElement(Save1).click();
	}

	public void Delete() {
		
		driver.findElement(Delete).click();
		driver.switchTo().alert().accept();
	}
}
