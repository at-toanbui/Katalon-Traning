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

WebUI.openBrowser('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

CountOption = WebUI.getNumberOfTotalOption(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'))

WebUI.verifyEqual(CountOption, 8)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Sunday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Monday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Tuesday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Wednesday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Thursday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Friday', false, 0)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Saturday', false, 0)

WebUI.selectOptionByIndex(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    '2')

WebUI.verifyElementText(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/lblMonday'), 
    'Day selected :- Monday')

WebUI.closeBrowser()

