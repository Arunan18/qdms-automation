package com.qa.automation.qdms.commonmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.pages.master.PlantPage;

public class Logout extends DriverIntialization {
	static PlantPage pp = new PlantPage();
	/*********************************************************************************************************************************************************
	 * Logout
	 **********************************************************************************************************************************************************/
	@Test
	public static void LogoutFunction() throws InterruptedException {
		PageFactory.initElements(driver, pp);
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//header[@class='ant-layout-header']/ul/div/div[2]/div/div/span")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath(
					"//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-vertical ant-dropdown-menu-light']/li[5]"))
					.click();

		} catch (NoSuchElementException e) {

		}
	}
}
