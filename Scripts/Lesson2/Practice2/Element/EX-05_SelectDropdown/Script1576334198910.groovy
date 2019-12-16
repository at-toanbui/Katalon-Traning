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
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

currentTotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'))

WebUI.verifyEqual(currentTotalOptions, totalOptions)

//Check data of options

WebUI.verifyOptionPresentByLabel(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Please select', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Sunday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Monday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Tuesday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Wednesday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Thursday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Friday', false, GlobalVariable.TIMEOUT)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Saturday', false, GlobalVariable.TIMEOUT)

WebUI.selectOptionByValue(findTestObject('Lesson2/Practice2/Element/ddlSelectDay'), 'Monday', true)

WebUI.verifyElementText(findTestObject('Lesson2/Practice2/Element/lblSelectedValue'), 'Day selected :- Monday')

