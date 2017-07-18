package Cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BasePage;
import Util.Constant;

public class CashierMenuPage extends BasePage{

	public CashierMenuPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	public void clickCashierMenuWithdrawLink(){
		WebDriverWait wait= new WebDriverWait(d,100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierMenu_MyAccountWithdraw)));
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		WebElement CashierMenuWithdrawLink=d.findElement(By.cssSelector(Constant.CashierMenu_MyAccountWithdraw));
		 ((JavascriptExecutor) d).executeScript("arguments[0].click();", CashierMenuWithdrawLink);
//		WebElement TempApp=d.findElement(By.className("div.app"));
//		 wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
//		 TempApp.click();
		//d.findElement(By.cssSelector(Constant.CashierMenu_MyAccountWithdraw)).click();
	}
}
