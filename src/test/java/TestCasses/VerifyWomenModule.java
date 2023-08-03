package TestCasses;

import org.testng.annotations.Test;

import PomClasses.HomePageAfterLogin;
import Utilities.BaseClass;

public class VerifyWomenModule extends BaseClass{
	@Test
	public void Tc_Women_003() {
		
	HomePageAfterLogin HPL = new HomePageAfterLogin(driver);
	HPL.getwomenKurthiAddToCart().click();
	HPL.getCart().click();
	String cart = HPL.getRayYonSleeveLenth().getText();
	if(cart.contains("Fabric : Rayon")) {
		System.out.println("the test case is passed");
	}
	else {
		System.out.println("test case fails");
	}
	}
}
