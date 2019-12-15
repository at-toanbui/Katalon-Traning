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

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/javascript-alert-box-demo.html')

WebUI.click(findTestObject('Day2_Practice2/Ex06_07_08/Page_Selenium Easy Demo - Automate All Scenarios/btnClickAlertBox'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Day2_Practice2/Ex06_07_08/Page_Selenium Easy Demo - Automate All Scenarios/button_Click me'))

WebUI.dismissAlert()

WebUI.click(findTestObject('Day2_Practice2/Ex06_07_08/Page_Selenium Easy Demo - Automate All Scenarios/button_Click for Prompt Box'))

WebUI.setAlertText('Katalon Automation Testing')

WebUI.acceptAlert()

text = WebUI.getText(findTestObject('Day2_Practice2/Ex06_07_08/Page_Selenium Easy Demo - Automate All Scenarios/lblTextDisplay'), 
    FailureHandling.STOP_ON_FAILURE)

text.contains('You have entered "Katalon Automation Testing"')

WebUI.closeBrowser()

