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

WebUI.navigateToUrl(GlobalVariable.URLSE05)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

TotalOptions = WebUI.getNumberOfTotalOption(findTestObject('Practice Day 2/Element/EX-05/ddlSelectADay'))

WebUI.verifyEqual(TotalOptions, 8)

WebUI.click(findTestObject('Practice Day 2/Element/EX-05/ddlSelectADay'))

WebUI.selectOptionByLabel(findTestObject('Practice Day 2/Element/EX-05/ddlSelectADay'), 'Monday', false)

text = WebUI.getText(findTestObject('Practice Day 2/Element/EX-05/lblDaySelectedMonday'))

WebUI.verifyMatch(text, 'Day selected :- Monday', false)

