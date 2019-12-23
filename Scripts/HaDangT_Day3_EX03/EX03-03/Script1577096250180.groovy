import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.urlPractice1)

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX03-03/Page_My Store/txtSearch'), keyword3)

WebUI.click(findTestObject('HaDangT_Day3_EX03-03/Page_My Store/btnSearch'))

WebUI.waitForElementPresent(findTestObject('HaDangT_Day3_EX03-03/Page_Search - My Store/dblProducts'), 0)

List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('HaDangT_Day3_EX03-03/Page_Search - My Store/dblProducts'), 
    5)

for (int i = 0; i < elements.size(); i++) {
    Assert.assertTrue(elements.get(i).getText().toString().contains(keyword3))
}

