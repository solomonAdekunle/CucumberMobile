package Pages;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class ChatPage extends BasePage{

	public ChatPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	 public void isLiveChatSuperCasinoLogoPresent(){
	 WebElement Frame = d.findElement(By.cssSelector("iframe.noFrame"));
    	d.switchTo().frame(Frame);
    	 WebDriverWait wait= new WebDriverWait(d,120);
		 WebElement Logo= d.findElement(By.cssSelector(Constant.LiveChat_SupercasinoLogo));
		 wait.until(ExpectedConditions.visibilityOf(Logo));
		 Logo.isDisplayed();
		 System.out.println(Logo.isDisplayed());
		 Assert.assertTrue(Logo.isDisplayed());
		 d.navigate().back();
		
		 
	 }

}
