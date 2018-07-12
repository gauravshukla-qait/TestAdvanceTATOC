package com.qait.automation.TestAdvanceTATOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdvanceTatocTest {

	WebDriver driver;
	HomeAction homeAction;
	HoverMenuAction hoverAction;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testHomePageAppears() {
		homeAction = new HomeAction(driver);
		homeAction.testHomePageAppears();
	}
	
	@Test(dependsOnMethods= {"testHomePageAppears"})
	public void verifyAdvanceCourseOpens() {
		homeAction.openAdvanceCourse();
	}
	
	@Test(dependsOnMethods= {"verifyAdvanceCourseOpens"})
	public void checkHoverActionPerforms()  {
		hoverAction = new HoverMenuAction(driver);
		hoverAction.testHoverActionPerforms();
	}
}
