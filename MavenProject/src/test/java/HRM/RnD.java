package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RnD {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();	
		driver.get ( "https://staging.orthocareondemand.com/search-doctors") ;
		System.out.println(driver.findElements(By.xpath("//*[@id=\"list\"]")).size());
		//*[@id="list"]
  }
}
