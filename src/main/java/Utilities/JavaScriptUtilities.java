package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities {
	
	public void javaScriptClick(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0].click();",ele);
	}
	public void javaScriptSendData(WebDriver driver,WebElement ele,String dataToSend) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0].value="+dataToSend+";",ele);
	}
	public void javaScriptHighLightElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0].style.border='4px solid blue';",ele);
	}
	public void javaScriptNormalScroll(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,300);");
}
	public void javaScriptVerifyTitle(WebDriver driver,String expectedTitle) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String acturalTitle = (String) jse.executeScript("return document.title;");
		if (acturalTitle.equals(expectedTitle)) {
			System.out.println("the title is same");
		}
		else {
			System.out.println("the tittle is not same");
		}
	}
		public void javaScriptVerifyUrl(WebDriver driver,String expectedTitle) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			String acturalURL = (String) jse.executeScript("return document.Url");
			if (acturalURL.equals(expectedTitle)) {
				System.out.println("the url is same");
			}
			else {
				System.out.println("the url is not same");
			}
		
	}
}