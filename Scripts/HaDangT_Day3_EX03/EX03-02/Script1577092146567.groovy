import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.navigateToUrl(GlobalVariable.urlPractice1)

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX03-02/Page_My Store/txtSearch'), keyword2)

WebUI.click(findTestObject('HaDangT_Day3_EX03-02/Page_My Store/btnSearch'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX03-02/Page_Search - My Store/lblNumberOfResults'), 0)

WebUI.waitForElementPresent(findTestObject('HaDangT_Day3_EX03-02/Page_Search - My Store/dblProducts'), 0)

lblNumberOfResults = WebUI.getText(findTestObject('HaDangT_Day3_EX03-02/Page_Search - My Store/lblNumberOfResults'))

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('HaDangT_Day3_EX03-02/Page_Search - My Store/dblProducts'), 
    5)

if (lblNumberOfResults.contains(elements.size().toString())) {
    WebUI.comment('Passed')
}

