package Cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BasePage;
import Util.Constant;

public class TransactionPage extends BasePage {

	public TransactionPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean isTransactionTitlePageDisplay(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierTransaction_PageTitle)));
		return d.findElement(By.cssSelector(Constant.CashierTransaction_PageTitle)).isDisplayed();
		
	}
	 public void NavigateBackToHomePage(){
		 d.navigate().back();
		 WebDriverWait wait= new WebDriverWait(d,20);
		 d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
			WebElement Logoutlink=d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
			wait.until(ExpectedConditions.visibilityOf(Logoutlink));
			((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);
	 }
}
