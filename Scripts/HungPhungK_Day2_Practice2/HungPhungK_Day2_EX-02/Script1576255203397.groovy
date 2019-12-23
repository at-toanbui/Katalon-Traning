import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://cms.demo.katalon.com/')

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day2_Practice2/txtSearch'), 10)

WebUI.setText(findTestObject('HungPhungK_Day2_Practice2/txtSearch'), 'Woo Single #2')

WebUI.submit(findTestObject('HungPhungK_Day2_Practice2/txtSearch'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HungPhungK_Day2_Practice2/lnkWooSingleThumbnail'), 10)

String title = WebUI.getWindowTitle()
String titlevalue = 'Woo Single #2 – Katalon Shop'

if(title.equals(titlevalue)){
	WebUI.comment('Title match')
  } else {
	WebUI.comment('Title is not match')
  }
