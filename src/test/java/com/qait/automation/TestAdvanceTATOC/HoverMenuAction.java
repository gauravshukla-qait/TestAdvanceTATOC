package com.qait.automation.TestAdvanceTATOC;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverMenuAction {

	WebDriver driver;

	public HoverMenuAction(WebDriver driver) {
		this.driver = driver;
	}

	public void performHoverAction() {
		WebElement hoverElement = driver.findElement(By.className("m2"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverElement).build().perform();
	}

	public void selectGoNext() {
		List<WebElement> elements = driver.findElements(By.className("menuitem"));
		System.out.println("elements=="+elements);
		for (WebElement element : elements) {
			if (element.getText().equals("Go Next")) {
				element.click();
				break;
			}
		}
	}

	public void testHoverActionPerforms() {
		performHoverAction();
		selectGoNext();
		String actual = driver.findElement(By.tagName("h1")).getText();
		assertEquals(actual, "Query Gate");
	}
}
