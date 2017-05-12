package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ExternalPage extends BasePage{

	public ExternalPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	
  public void isGamCareSiteDisplayed() throws InterruptedException{
	  Set<String> Windowids1 = d.getWindowHandles();
		Iterator<String> it1 = Windowids1.iterator();
		String MainWindowids1 = it1.next();
		String tabbedWindowId1 = it1.next();
		Windowids1.size();
		System.out.println(Windowids1.size());
		System.out.println(MainWindowids1);
		System.out.println(tabbedWindowId1);
		while (it1.hasNext())
			;
		d.switchTo().window(tabbedWindowId1);
		Thread.sleep(1000);
		Assert.assertEquals(d.getCurrentUrl(), "http://www.gamcare.org.uk/training-and-certification/gamcare-certification/who-gamcare-certified");
		d.close();
		d.switchTo().window(MainWindowids1);

	}
		
	
   public void isGamblingCommissionWebSiteDisplayed() throws InterruptedException{
	   Set<String> Windowids = d.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext())
			;
		// System.out.println(it.next());
		d.switchTo().window(tabbedWindowId);
		Thread.sleep(1000);
		Assert.assertEquals(d.getCurrentUrl(), "https://secure.gamblingcommission.gov.uk/PublicRegister/Search/Detail/39144");
		Thread.sleep(1000);
		d.close();
		d.switchTo().window(MainWindowids);
			
		}
	   
   
   public void isNetPlayTvBettssonCoporateSiteDisplayed() throws InterruptedException{
	   Set<String> Windowids = d.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext())
			;
		// System.out.println(it.next());
		d.switchTo().window(tabbedWindowId);
		Thread.sleep(1000);
		Assert.assertEquals(d.getCurrentUrl(), "http://www.betssongroup.com/");
		Thread.sleep(1000);
		d.close();
		d.switchTo().window(MainWindowids);
		
	   
   }
   public void isNetPlaytvFacebookPageDisplayed() throws InterruptedException{
	   Set<String> Windowids = d.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext())
			;
		// System.out.println(it.next());
		d.switchTo().window(tabbedWindowId);
		Thread.sleep(1000);
		Assert.assertEquals(d.getCurrentUrl(), "https://m.facebook.com/SuperCasinoOfficial");
		Thread.sleep(1000);
		d.close();
		d.switchTo().window(MainWindowids);
		
	   
   }
   public void isNetPlayTvTwitterPageDisplayed() throws InterruptedException{
	   Set<String> Windowids = d.getWindowHandles();
		Iterator<String> it = Windowids.iterator();
		String MainWindowids = it.next();
		String tabbedWindowId = it.next();
		System.out.println(MainWindowids);
		System.out.println(tabbedWindowId);
		while (it.hasNext())
			;
		// System.out.println(it.next());
		d.switchTo().window(tabbedWindowId);
		Thread.sleep(1000);
		Assert.assertEquals(d.getCurrentUrl(), "https://mobile.twitter.com/supercasinocom");
		Thread.sleep(1000);
		d.close();
		d.switchTo().window(MainWindowids);
	   
   }
}