package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {
	WebDriver driver;
	public HomePageBeforeLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[(@name='loginBtn')]")
	private WebElement loginMainButton;
	
	public WebElement getloginMainButton() {
		return loginMainButton;
	}
}
