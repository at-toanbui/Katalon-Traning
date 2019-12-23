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

WebUI.navigateToUrl(GlobalVariable.urlPractice1)

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX03-01/Page_My Store/txtSearch'), keyword1)

WebUI.click(findTestObject('HaDangT_Day3_EX03-01/Page_My Store/btnSearch'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX03-01/Page_Search - My Store/lblNoResultsWereFound'), 0)

lblNoResults = WebUI.getText(findTestObject('HaDangT_Day3_EX03-01/Page_Search - My Store/lblNoResultsWereFound'))

if (lblNoResults.contains(keyword1)) {
    WebUI.verifyMatch(lblNoResults, ('No results were found for your search "' + keyword1) + '"', true)
}

