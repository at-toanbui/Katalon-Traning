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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Practice Day 3/EX03-03/Page_My Store/txtSearch'), 'Dress')

WebUI.click(findTestObject('Practice Day 3/EX03-03/Page_My Store/btnSearch'))

WebUI.click(findTestObject('Practice Day 3/EX03-03/Page_Search - My Store/lblResult'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement listProducts = driver.findElement(By.xpath('//ul[contains(@class, "product_list")]'))

List<WebElement> itemProducts = listProducts.findElements(By.xpath("//ul[contains(@class, 'product_list')]/child::li"))

int numberProduct = itemProducts.size()

int countTitleMapping = 0

for (int item = 0; item < numberProduct; item++) {
	List<WebElement> itemTitle = itemProducts.get(item).findElements(By.xpath('//a[contains(@class, "product-name")]'))
	String title = itemTitle.get(item).getText()
	WebUI.verifyMatch(title, '.*Dress*', true)
	if (WebUI.verifyMatch(title, '.*Dress*', true)) {
		countTitleMapping++
	}
}

WebUI.verifyEqual(countTitleMapping, numberProduct)

