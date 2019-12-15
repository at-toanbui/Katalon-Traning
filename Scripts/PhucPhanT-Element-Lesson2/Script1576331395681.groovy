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

WebUI.openBrowser('https://www.seleniumeasy.com/test/basic-first-form-demo.html\n')

WebUI.sendKeys(findTestObject('Practic2/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/txtEnterMessage'), 
    'Katalon automation test')

WebUI.click(findTestObject('Practic2/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/btnShowMessage'))

a = WebUI.getText(findTestObject('Practic2/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/Message'))

WebUI.verifyMatch(a, 'Katalon automation test', true)

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-checkbox-demo.html\n')

WebUI.click(findTestObject('Practic2/Page_Selenium Easy - Checkbox demo for automation using selenium/Page_Selenium Easy - Checkbox demo for automation using selenium/btnCheckAll'))

WebUI.verifyElementChecked(findTestObject('Practic2/Page_Selenium Easy - Checkbox demo for automation using selenium/chkOption1'), 
    2)

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

WebUI.click(findTestObject('Page_Selenium Easy Demo - Automate All Scenarios/ddlDemo'))

TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Page_Selenium Easy Demo - Automate All Scenarios/ddlDemo'))

println('No of Roles are :' + TotalOptions)

'Verifying the number of Options in the dropdown with Expected result'
WebUI.verifyEqual(TotalOptions, 8)

WebUI.selectOptionByIndex(findTestObject('Page_Selenium Easy Demo - Automate All Scenarios/ddlDemo'), 2)

option = WebUI.getAttribute(findTestObject('Page_Selenium Easy Demo - Automate All Scenarios/ddlDemo'), 'value')

WebUI.verifyMatch(option, 'Monday', true)

WebUI.closeBrowser()

