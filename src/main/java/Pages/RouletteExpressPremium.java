package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class RouletteExpressPremium extends BasePage {

	public RouletteExpressPremium(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	/* get the Current Url Address */
	public String isMenuIconwithinGameSessionPresent(){
		    this.waitForLoad(d);     
                  System.out.println(d.getCurrentUrl());
		return d.getCurrentUrl();
	
}
		
//		WebDriverWait wait= new WebDriverWait(d,15);
//		wait.until(ExpectedConditions.urlToBe(d.getCurrentUrl()));
//		System.out.println(d.getCurrentUrl());
		 
//		Dimension k = new Dimension(568,320);
//		/* Dimension k = new Dimension(768,1024);// ipad or tablet */
//		d.manage().window().setSize(k);
//		WebDriverWait wait = new WebDriverWait(d,30);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.RouletteExpressPremiun_MenuIcon)));
//		return  d.findElement(By.cssSelector(Constant.RouletteExpressPremiun_MenuIcon)).isDisplayed();
		
	 
	/* Navigate back to the Home Page */
	 public void NavigateBackToHomePage(){
		 d.navigate().back();
	 }
	 /* Wait for Page to load */
	 public void waitForLoad(WebDriver driver) {
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(pageLoadCondition);
	    }
}
