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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Lesson3/Practice2/HomePage/txtSearchField'), 'Dress')

WebUI.sendKeys(findTestObject('Lesson3/Practice2/HomePage/txtSearchField'), Keys.chord(Keys.ENTER))

WebDriver driver = DriverFactory.getWebDriver()

List list = driver.findElements(By.xpath('//ul[contains(@class,\'product_list\')]/li'))

msgCount = WebUI.getText(findTestObject('Lesson3/Practice3/Ex02/lblProductCount'))

count = Integer.parseInt(WebUI.getText(findTestObject('Lesson3/Practice3/Ex02/lblMessageResult')).substring(0, 1))

Pattern p = Pattern.compile('[^\\d]*[\\d]+[^\\d]+([\\d]+)')

Matcher m = p.matcher(msgCount)

if (m.find()) {
    WebUI.verifyEqual(list.size, m.group(1))

    WebUI.verifyEqual(list.size, count)
}

