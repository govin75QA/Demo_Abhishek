package com.Demo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
  WebDriver driver;
 @FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
 private WebElement search;
 @FindBy(how=How.XPATH,using="//input[@id='nav-search-submit-button']")
 private WebElement searchbutton;
 public Homepage(WebDriver driver) {
	 this.driver=driver;
 }
 public WebElement getsearch() {
	 return search;
 }
 public void clickonsearchbutton() {
	 searchbutton.click();
 }
}
