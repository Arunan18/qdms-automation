//***********************************************************************************
//* Description
//*------------
//* Plant Multiple Search Functionality
//***********************************************************************************
//*
//* Author           : Suntharalingam Arunan
//* Date Written     : 01/03/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//* TC-PLANT-0073        01/03/2023     Arunan     Orginal Version
//*
//************************************************************************************
package com.qa.automation.qdms.testcases.plant;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.commonmethods.CommonMethods;
import com.qa.automation.qdms.pages.master.PlantPage;
import com.qa.automation.qdms.testcases.login.LoginTest;

public class PlantMultiSearchTest extends DriverIntialization {
	PlantPage psp = new PlantPage();

	@Test
	public void plantMultiSearch() throws InterruptedException, IOException {
		PageFactory.initElements(driver, psp);
		boolean CodeTableData = true;
		boolean PlantTableData = true;
		boolean SbuTableData = true;
		boolean ManagerTableData = true;
		boolean AddressTableData = true;
		boolean ContactNoTableData = true;

		PageFactory.initElements(driver, psp);
		int firstrow = CommonMethods.getFirstRowNum(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\Master Module.xlsx", "Plant",
				"TC-PLANT-0073");
		int lastrow = CommonMethods.getLastRowNum(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\Master Module.xlsx", "Plant",
				"TC-PLANT-0073");

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\Master Module.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Plant");
		for (int i = firstrow; i <= lastrow; i++) {
			XSSFRow row = sheet.getRow(i);

			int Code = (int) row.getCell(11).getNumericCellValue();
			int Plant = (int) row.getCell(12).getNumericCellValue();
			int Sbu = (int) row.getCell(13).getNumericCellValue();
			int Manager = (int) row.getCell(14).getNumericCellValue();
			int Address = (int) row.getCell(15).getNumericCellValue();
			int ContactNo = (int) row.getCell(16).getNumericCellValue();

			LoginTest.Login();

//		STEP 1 : Plant - Plant Code Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.PlantCodeSearch, "STEP 1 : Plant - Plant Code");

//		STEP 2 : Plant - Plant Code Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.PlantCodeSearch, PlantPage.SearchTextBox,
					"STEP 2 : Plant - Plant Code");

//		STEP 3 : Plant - Plant Code Search Text Box Properties
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 3 : Plant - Plant Code");

//		STEP 4 : Plant - Plant Code Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 4 : Plant - Plant Code");

//		STEP 5 : Plant - Plant Code Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox, "STEP 5 : Plant - Plant Code",
					"Plant", 1, PlantPage.PlantCodeColumn);

//		STEP 6 : Plant - Plant Code Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll,
					"STEP 6 : Plant - Plant Code");

//		STEP 7 : Plant - Plant Code Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.PlantCodeColumn, PlantPage.PlantCodeColumnBefore,
					PlantPage.PlantCodeColumnAfter, "STEP 7 : Plant - Plant Code", Code, CodeTableData);

//		STEP 8 : Plant - Plant Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.PlantNameSearch, "STEP 8 : Plant - Plant");

//		STEP 9 : Plant - Plant Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.PlantNameSearch, PlantPage.SearchTextBox,
					"STEP 9 : Plant - Plant");

//		STEP 10 : Plant - Plant Search Text Box Properties
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 10 : Plant - Plant");

//		STEP 11 : Plant - Plant Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 11 : Plant - Plant");

//		STEP 12 : Plant - Plant Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox, "STEP 12 : Plant - Plant",
					"Plant", 2, PlantPage.PlantColumn);

//		STEP 13 : Plant - Plant Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll, "STEP 13 : Plant - Plant");

//		STEP 14 : Plant - Plant Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.PlantColumn, PlantPage.PlantColumnBefore,
					PlantPage.PlantColumnAfter, "STEP 14 : Plant - Plant", Plant, PlantTableData);

//		STEP 15 : Plant - Sub Business Unit Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.SbuSearch, "STEP 15 : Plant - Sub Business Unit");

//		STEP 16 : Plant - Sub Business Unit Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.SbuSearch, PlantPage.SearchTextBox,
					"STEP 16 : Plant - Sub Business Unit");

//		STEP 17 : Plant - Sub Business Unit Search Text Box Properties 
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 17 : Plant - Sub Business Unit");

//		STEP 18 : Plant - Sub Business Unit Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 18 : Plant - Sub Business Unit");

//		STEP 19 : Plant - Sub Business Unit Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox,
					"STEP 19 : Plant - Sub Business Unit", "Plant", 3, PlantPage.SbuColumn);

//		STEP 20 : Plant - Sub Business Unit Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll,
					"STEP 20 : Plant - Sub Business Unit");

//		STEP 21 : Sub Business Unit Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.SbuColumn, PlantPage.SbuColumnBefore,
					PlantPage.SbuColumnAfter, "STEP 21 : Plant - Sub Business Unit", Sbu, SbuTableData);

//		STEP 22 : Plant - Plant Manager Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.PlantManagerSearch, "STEP 22 : Plant - Plant Manager");

//		STEP 23 : Plant - Plant Manager Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.PlantManagerSearch, PlantPage.SearchTextBox,
					"STEP 23 : Plant - Plant Manager");

//		STEP 24 : Plant - Plant Manager Search Text Box Properties
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 24 : Plant - Plant Manager");

//		STEP 25 : Plant - Plant Manager Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 25 : Plant - Plant Manager");

//		STEP 26 : Plant - Plant Manager Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox,
					"STEP 26 : Plant - Plant Manager", "Plant", 4, PlantPage.managerColumn);

//		STEP 27 : Plant - Plant Manager Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll,
					"STEP 27 : Plant - Plant Manager");

//		STEP 28 : Plant - Plant Manager Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.managerColumn, PlantPage.managerColumnBefore,
					PlantPage.managerColumnAfter, "STEP 28 : Plant - Plant Manager", Manager, ManagerTableData);

//		STEP 29 : Plant - Address Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.AddressSearch, "STEP 29 : Plant - Address");

//		STEP 30 : Plant - Address Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.AddressSearch, PlantPage.SearchTextBox,
					"STEP 30 : Plant - Address");

//		STEP 31 : Plant - Address Search Text Box Properties
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 31 : Plant - Address");

//		STEP 32 : Plant - Address Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 32 : Plant - Address");

//		STEP 33 : Plant - Plant Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox, "STEP 33 : Plant - Address",
					"Plant", 5, PlantPage.AddressColumn);

//		STEP 34 : Plant - Plant Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll, "STEP 34 : Plant - Address");

//		STEP 35 : Plant - Plant Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.AddressColumn, PlantPage.addressColumnBefore,
					PlantPage.addressColumnAfter, "STEP 35 : Plant - Address", Address, AddressTableData);

//		STEP 36 : Plant - Contact No Search Button Properties
			MultiSearchMethods.checkSearch(PlantPage.ContactNoSearch, "STEP 36 : Plant - Contact No");

//		STEP 37 : Plant - Contact No Search Icon Click
			MultiSearchMethods.ClickSearch(PlantPage.ContactNoSearch, PlantPage.SearchTextBox,
					"STEP 37 : Plant - Contact No");

//		STEP 38 : Plant - Contact No Search Text Box Properties
			MultiSearchMethods.SearchTextBox(PlantPage.SearchTextBox, "STEP 38 : Plant - Contact No");

//		STEP 39 : Plant - Contact No Search Button Properties
			MultiSearchMethods.SearchButton(PlantPage.SearchBtn, "STEP 39 : Plant - Contact No");

//		STEP 40 : Plant - Contact No Search Data Input
			MultiSearchMethods.inputDataSearch("TC-PLANT-0073", PlantPage.SearchTextBox, "STEP 40 : Plant - Contact No",
					"Plant", 6, PlantPage.MobileColumn);

//		STEP 41 : Plant - Contact No Search Button Click
			MultiSearchMethods.SearchButtonClick(PlantPage.SearchBtn, PlantPage.ResetAll,
					"STEP 41 : Plant - Contact No");

//		STEP 42 : Plant - Contact No Single Search Function
			MultiSearchMethods.checkAfterSearchData(PlantPage.MobileColumn, PlantPage.mobileColumnBefore,
					PlantPage.mobileColumnAfter, "STEP 42 : Plant - Contact No", ContactNo, ContactNoTableData);

//		STEP 43 : Plant Multi Search (Check Correct Data Count Filter) ☑ 
			MultiSearchMethods.MultipleSearch("STEP 43 : Plant");

			MultiSearchMethods.Logout();
		}

	}
}
