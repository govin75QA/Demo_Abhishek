package com.demo.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Demo.Pom.Homepage;
import com.Demo.Utility.BaseClass;

public class Test_Two extends BaseClass{
	@Test
	public void verify_Amazontwo() {
		Homepage homepage=PageFactory.initElements(driver, Homepage.class);
		homepage.getsearch().sendKeys("Footwear");
		homepage.clickonsearchbutton();
		System.out.println("Test Pass");
	}


}
