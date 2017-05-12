package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.Constant;

public class VIPPage extends BasePage{

	public VIPPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isVIPClubLogoDisplay(){
		return d.findElement(By.cssSelector(Constant.Vip_VipLogo)).isDisplayed();
		
	}

}
