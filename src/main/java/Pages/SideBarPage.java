package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class SideBarPage extends BasePage {

	public SideBarPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	public void clickJoinNow(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SideBarMenu_JoinNow)));
		WebElement JoinNowButton=d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", JoinNowButton);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow)).click();
		
	}
}
