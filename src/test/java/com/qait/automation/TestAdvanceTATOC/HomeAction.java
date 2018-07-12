package com.qait.automation.TestAdvanceTATOC;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAction {

	WebDriver driver;
	String homePageURL = "http://10.0.1.86/tatoc/";
	
	public HomeAction(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void launchHomePage() {
		driver.get(homePageURL);
	}
	
	public String getHomePageHeader() {
		String header = driver.findElement(By.tagName("h1")).getText();
		return header;
	}
	
	public void testHomePageAppears() {
		launchHomePage();
		assertTrue(driver.findElement(By.tagName("h1")).getText().equals(getHomePageHeader()));
	}
	
	public void openAdvanceCourse() {
		driver.findElement(By.linkText("Advanced Course")).click();
		assertTrue(driver.findElement(By.tagName("h1")).getText().equals("Hover Menu"));
	}
}
