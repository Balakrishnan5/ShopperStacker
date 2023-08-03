package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAfterLogin{
	
	public HomePageAfterLogin (WebDriver driver) {
	PageFactory.initElements(driver,this);

}
@FindBy(id="men")
private WebElement MenMenuLink;

@FindBy(xpath="//*[name()='svg'and@data-testid='settingsIcon']")
private WebElement AccountSttingIcon;

@FindBy(xpath="//*[name()='svg'and@data-testid='LogoutIcon']")
private WebElement LogoutIcon;

@FindBy(id="kids")
private WebElement KidsMenuLink;

@FindBy(id="electronics")
private WebElement ElectronicsMenuLink;

@FindBy(xpath="//*[name()='svg'and@id='cartIcon']")
private WebElement MainCartIcon;
@FindBy(id="beautyPriducts")
private WebElement ElectronicMenuLink;
@FindBy(linkText="add to cart")
private WebElement womenKurthiAddToCart;
@FindBy(id="cart")
private WebElement cart;
@FindBy(xpath="//h3[text()='indianclothings')/..//p[2]")
private WebElement rayYonSleeveLenth;
@FindBy(id="women")
private WebElement WomenMenuLink;

public WebElement getWomenMenuLink() {
	return WomenMenuLink;
}
public WebElement getRayYonSleeveLenth() {
	return rayYonSleeveLenth;
}
public WebElement getElectronicsMenuLink() {
	return ElectronicsMenuLink;
}
public WebElement getMainCartIcon() {
	return MainCartIcon;
}
public WebElement getMenMenuLink() {
	return MenMenuLink;
}
public WebElement getAccountSttingIcon() {
	return AccountSttingIcon;
}
public WebElement getLogoutIcon() {
	return LogoutIcon;
}
public WebElement getKidsMenuLink() {
	return KidsMenuLink;
}
public WebElement getwomenKurthiAddToCart() {
	return womenKurthiAddToCart;
}
public WebElement getCart() {
	return cart;
}
}
