package Utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PomClasses.HomePageAfterLogin;
import PomClasses.HomePageBeforeLogin;
import PomClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass() throws Throwable {
		
		DataUtilities dataProperties = new DataUtilities();
	//	dataProperties.dataFromPropertiesFile
		String BROWSER=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "Browser");
		
		if(BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		String URL=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "url");
		driver.get(URL);
		
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() throws Throwable {
		DataUtilities dataProperties = new DataUtilities();
		String Email=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "username");
		String Pass=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "password");
		
		driver.navigate().refresh();

		HomePageBeforeLogin HBL = new HomePageBeforeLogin(driver);
	    HBL.getloginMainButton().click();
	    
	    LoginPage Lp = new LoginPage(driver);
	    
	    Lp.getEmailTextField().sendKeys(Email);
	    Lp.getPassTextField().sendKeys(Pass);
	    Lp.getLoginButton().click();
		
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() throws Throwable {
		Thread.sleep(10000);
	HomePageAfterLogin HomePageEle = new HomePageAfterLogin(driver);
	
	
	HomePageEle.getAccountSttingIcon().click();
	HomePageEle.getLogoutIcon().click();	
	}
	
	
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		driver.quit();
	}
}