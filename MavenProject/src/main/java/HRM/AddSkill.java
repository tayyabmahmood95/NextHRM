package HRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddSkill {
	
public WebDriver driver;
	
	By Skills = By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[4]/a");
	By Submit = By.xpath("//*[@id=\"addskilltypesformsubmit\"]");
	By Save = By.xpath("//*[@id=\"skillSave\"]");
	By WriteSkill = By.className("select2-search__field");
	
	
	public AddSkill (WebDriver driver) {
		this.driver = driver; 
		}

		public void Skills1(String SkillName) {
			
			driver.findElement(Skills).click();;
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
		    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("select2-search__field")));
		    driver.findElement(WriteSkill).click();
			driver.findElement(WriteSkill).sendKeys(SkillName);
			
			Robot robot;
		     try {
		     	robot=new Robot();
		     	robot.keyPress(KeyEvent.VK_ENTER);
		     		} catch (AWTException e) {
		     		// TODO Auto-generated catch block
		     		e.printStackTrace();
		     	}
		}
		     
		 	public void submit() {
				
				 driver.findElement(Submit).click();
					
			}
			
		 
	    
	     public void dropdown() {
	     
	     Select DropdownExperience = new Select (driver.findElement(By.xpath("//*[@id=\"regressionexp_id\"]")));
	     DropdownExperience.selectByVisibleText("1 Year");
	     Select DropdownRating = new Select (driver.findElement(By.xpath("//*[@id=\"regressionlevel\"]")));
	     DropdownRating.selectByVisibleText("Excellent");
	     }
	     
	     public void Save() {
	     driver.findElement(Save).click();	
	}


		}
