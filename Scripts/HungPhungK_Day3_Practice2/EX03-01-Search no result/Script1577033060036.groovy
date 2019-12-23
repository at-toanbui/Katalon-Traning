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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/EX03-Search/Page_My Store/btnSearch'), GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/EX03-Search/Page_My Store/txtSearch'), '${keyword}')

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/EX03-Search/Page_My Store/btnSearch'))

WebUI.verifyElementText(findTestObject('HungPhungK_Day3_Practice3/EX03-Search/Page_Search - My Store/lblResult'), 'No results were found for your search "${keyword}"')

