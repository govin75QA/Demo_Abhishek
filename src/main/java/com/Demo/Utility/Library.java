package com.Demo.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library extends BaseClass{
	
	public  void backward() {
		driver.navigate().back();
	}
  public void handlemousehover(WebElement element ) {
	  Actions act=new Actions(driver);
	  act.moveToElement(element).click(element).build().perform();
  }
  public void handledropdown(WebElement elemenet,String text) {
	  Select sc=new Select(elemenet);
	  sc.selectByVisibleText(text);
  }
}
