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
		 Set<String> Windowids = d.getWindowHandles();
			Iterator<String> it = Windowids.iterator();
			String MainWindowids = it.next();
			String betssonChatWindowId = it.next();
			System.out.println(MainWindowids);
			System.out.println(betssonChatWindowId);
			while (it.hasNext())
				;
			// System.out.println(it.next());
			d.switchTo().window(betssonChatWindowId);
		 WebElement Logo= d.findElement(By.cssSelector(Constant.LiveChat_SupercasinoLogo));
		 WebDriverWait wait= new WebDriverWait(d, 30);
		 wait.until(ExpectedConditions.visibilityOf(Logo));
		 Logo.isDisplayed();
		 Assert.assertTrue(Logo.isDisplayed());
		 d.close();
		 d.switchTo().window(MainWindowids);
		 
	 }

}
