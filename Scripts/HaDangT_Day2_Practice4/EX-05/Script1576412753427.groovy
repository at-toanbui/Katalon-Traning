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

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

number = WebUI.getNumberOfTotalOption(findTestObject('HaDangT_Day2_Practice4/Page_Selenium Easy Demo - Automate All Scenarios/ddlDay'))

WebUI.verifyEqual(number, 8)

WebUI.click(findTestObject('HaDangT_Day2_Practice4/Page_Selenium Easy Demo - Automate All Scenarios/ddlDay'))

WebUI.selectOptionByValue(findTestObject('HaDangT_Day2_Practice4/Page_Selenium Easy Demo - Automate All Scenarios/ddlDay'), 'Monday', 
    true)

WebUI.verifyElementVisible(findTestObject('HaDangT_Day2_Practice4/Page_Selenium Easy Demo - Automate All Scenarios/lblDaySelected'))

WebUI.closeBrowser()

