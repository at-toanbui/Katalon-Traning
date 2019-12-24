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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice3/DanhPhamC_Day3_EX03-02/Page_My Store/txtSearch'), 
    'dress')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice3/DanhPhamC_Day3_EX03-02/Page_My Store/btnSearch'))

textresult = WebUI.getText(findTestObject('Lesson3/DanhPhamC_Day3_Practice3/DanhPhamC_Day3_EX03-02/Page_Search - My Store/lblResulttext'))

double a = Double.parseDouble(textresult.substring(1))

WebDriver driver = DriverFactory.getWebDriver()

int count = driver.findElements(By.xpath('//div[@class = \'product-container\']')).size()

WebUI.verifyEqual(count, a)

