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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Lesson3/Ex03 Searching/Page_My Store/txtSearch'), 'Dress')

WebUI.sendKeys(findTestObject('Lesson3/Ex03 Searching/Page_My Store/txtSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebDriver driver = DriverFactory.getWebDriver()

def eleCount = driver.findElements(By.xpath('//a[@class="product-name" and @itemprop="url"]')).size()

//println(eleCount.size())
result = WebUI.getText(findTestObject('Lesson3/Ex03 Searching/Page_Search - My Store/msgResult'))

WebUI.verifyMatch(result, eleCount + ' results have been found.', false)

