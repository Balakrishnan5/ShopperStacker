package TestCasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.WebDriverUtilities;

public class TC_001 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebElement loginButton=driver.findElement(By.id("loginBtn"));
		JavascriptExecutor js	=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();",loginButton);
		
	 WebElement UsertextField =  driver.findElement(By.id("Email"));
	 js.executeScript("argument[0].value='gsgfs';",UsertextField);
	
	 WebElement PassTextField =  driver.findElement(By.id("Password"));
	 js.executeScript("argument[0].style.border=5px solid brown",PassTextField);
	 js.executeScript("scrollBy(0,400);");
	 
	 String Tittle=(String)js.executeScript("return document.title;");
	 System.out.println(Tittle);
	 if(Tittle.equals("ShoppersStack | Login")){
	 System.out.println("its matched");
	 }
	 else {
		 System.out.println("its not matched");
	 }
	 
	 
	}

}
