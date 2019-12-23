package search

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement

public class SearchResultPage {
	int count=0;
	@Keyword
	def verifyNumberOfItem(){
		findTestObject(String productName=WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lblProductName')));
		List<WebElement> lstElement = WebUI.findWebElements(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lstItem'),7);
		for (WebElement element:lstElement){
			if (productName.contains("Dress")){
				count++
			}
		}
		return count;
		println ("NUMBER OF ITEM: " +count);
	}

	@Keyword
	def getNuberOfItem(){
		findTestObject(String headCounter=WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lblHeadCounter')));
		//String headCounter=WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lblHeadCounter'))
		int numberOfResult = Character.getNumericValue(headCounter.trim().charAt(0));
		return (numberOfResult == count)
		println ("NUMBER IN MESSAGE: " +numberOfResult);
	}

	@Keyword
	def verifyAllItemsContainSearchKey(){
		boolean flag=false;
		findTestObject(String productName=WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lblProductName')))
		List<WebElement> lstElement = WebUI.findWebElements(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lstItem'),7);
		for (WebElement element:lstElement){
			if (productName.contains("Dress")){
				flag= true;
			}
		}
		return flag ;
	}
}
