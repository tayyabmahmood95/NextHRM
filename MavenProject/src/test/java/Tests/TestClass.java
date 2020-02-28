package Tests;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HRM.AddSkill;
import HRM.Events;
import HRM.Login;
import HRM.Profile;
import HRM.RemoveSkill;
import HRM.Report;
import HRM.Logout;
public class TestClass {
	
	public WebDriver driver;
	Login obj;
	Events objEvent;
	Profile objProfile;
	AddSkill objAddSkill;
	RemoveSkill objRemoveSkill;
	Report objReport;
	Logout objLogout;

	
	@Parameters({ "username", "password" })
  @Test(priority=0)
  public void LoginTest(String username,String password) {
	 
	  obj.username(username);
	  obj.password(password);
	  obj.Signin();
	}
	
	@Test (priority=6)
	public void Logout () {
		objLogout.Logout1();
		
	}
	
	@Parameters({"FromDate1", "ToDate1"})
	@Test(priority=5)
	public void ReportTest(String ToDate1, String FromDate1) {
		
		objReport.Report1();
		objReport.FromDate(FromDate1);
		objReport.ToDate(ToDate1);
		objReport.search();
		objReport.Export();
		
		
	}
	
	
  @Parameters({"EventName", "EventDate"})
  @Test(priority=4)
  public void EventTest(String EventName, String EventDate) {
	  objEvent.EventClick();	 
	  objEvent.NewClick();
	  objEvent.NameClick(EventName);
	  objEvent.StartDate(EventDate);
	  objEvent.Save();
	  objEvent.Edit();
	  objEvent.ReminderTime1();
	  objEvent.Hour();
	  objEvent.Save1();
	  objEvent.Delete();
	  
  }
  
  @Test(priority=1)
	public void ProfileTest() {
	
	  objProfile.ProfileCLick();
	  objProfile.Qualification();
		
		
	}
  @Parameters({"SkillName"})
  @Test(priority=2)
  public void AddSkill(String SkillName)
  {
	 objAddSkill.Skills1(SkillName);
	 objAddSkill.submit();
	 objAddSkill.dropdown();
	 objAddSkill.Save();
	  
  }
  
  @Test(priority=3)
  public void RemoveSkill()
  {
	  objRemoveSkill.Remove();
	  objRemoveSkill.Save();
	  
  }
  

	@BeforeTest 
	public void Browser() {
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        //options.addArguments("window-size=1200x600");
        options.addArguments("window-size=1920x1080");
        driver = new ChromeDriver(options);
		//driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get ( "https://nexthrm.vteamslabs.com/") ;
		obj=new Login(driver);
		objEvent = new Events(driver);
		objProfile = new Profile(driver);
		objAddSkill = new AddSkill(driver);
		objRemoveSkill = new RemoveSkill(driver);
		objReport = new Report(driver);
		objLogout = new Logout(driver);
	}

	@AfterTest
     public void Closure (){
         driver.close();
     }
}
