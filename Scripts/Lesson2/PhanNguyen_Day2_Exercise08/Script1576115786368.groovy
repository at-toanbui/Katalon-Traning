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

WebUI.openBrowser('https://www.seleniumeasy.com/test/javascript-alert-box-demo.html')

WebUI.click(findTestObject('Lesson2/Exercise-06-07-08/Page_Selenium Easy Demo - Automate All Scenarios/btnClickForPrompt Box'))

textAlert = WebUI.getAlertText()

WebUI.verifyMatch(textAlert, 'Please enter your name', false)

WebUI.setAlertText('Katalon Automation Testing')

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Lesson2/Exercise-06-07-08/Page_Selenium Easy Demo - Automate All Scenarios/msgYouHaveEntered'), 
    'You have entered \'Katalon Automation Testing\' !')

WebUI.closeBrowser()

