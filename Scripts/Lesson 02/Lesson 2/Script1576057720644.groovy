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

WebUI.navigateToUrl('https://www.toolsqa.com/automation-practice-form/')

WebUI.sendKeys(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/txtFirstname'), 
    'katalon')

WebUI.sendKeys(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/txtLastName'), 
    'automation')

WebUI.check(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/rdMale'))

WebUI.verifyElementChecked(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/rdMale'), 
    0)

WebUI.click(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/chkAutomationTester'))

WebUI.verifyElementChecked(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/chkAutomationTester'), 
    2)

//title = WebUI.getWindowTitle()

WebUI.verifyMatch(WebUI.getWindowTitle(), 'Demo Form for practicing Selenium Automation', false)

WebUI.selectOptionByValue(findTestObject('Page_Demo Form for practicing Selenium Automation/Page_Demo Form for practicing Selenium Automation/ddlContinents'), 
    'AUS', false)

WebUI.closeBrowser()

