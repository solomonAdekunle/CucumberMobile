package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class RouletteExpressPremium extends BasePage {

	public RouletteExpressPremium(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isMenuIconwithinGameSessionPresent(){
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.RouletteExpressPremiun_MenuIcon)));
		return  d.findElement(By.cssSelector(Constant.RouletteExpressPremiun_MenuIcon)).isDisplayed();
	 
	}
	 public void NavigateBackToHomePage(){
		 d.navigate().back();
	 }
}
