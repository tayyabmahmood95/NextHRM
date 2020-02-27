package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public WebDriver driver;
	By username = By.xpath("//*[@id=\"userName\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By Signin = By.xpath("//*[@id=\"loginFormSubmit\"]");
	

	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void username(String usernameData ) {
		
		driver.findElement(username).click();
		driver.findElement(username).sendKeys(usernameData);
	}
	
public void password(String passwordData) {
		
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(passwordData);
	}
public void Signin() {
	
	driver.findElement(Signin).click();

}
}

