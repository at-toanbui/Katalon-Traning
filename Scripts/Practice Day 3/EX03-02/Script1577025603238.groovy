import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
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

WebUI.navigateToUrl(GlobalVariable.URLAUTO)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('Practice Day 3/EX03-02/Page_My Store/txtSearch'), 'Dress')

WebUI.click(findTestObject('Practice Day 3/EX03-02/Page_My Store/btnSearch'))

WebUI.verifyElementText(findTestObject('Practice Day 3/EX03-02/Page_Search - My Store/lblResult'), '7 results have been found.')

WebDriver driver = DriverFactory.getWebDriver()

String list = driver.findElements(By.xpath('//li[contains(@class, "ajax_block_product")]')).size()

String extractInt = WebUI.getText(findTestObject('Practice Day 3/EX03-02/Page_Search - My Store/lblResult')).replaceAll('[^0-9]', '')

WebUI.verifyEqual(list, extractInt)

