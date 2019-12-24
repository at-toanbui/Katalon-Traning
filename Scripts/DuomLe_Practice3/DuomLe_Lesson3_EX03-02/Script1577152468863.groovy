import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-02/txtSearch'), 'Dress')

WebUI.sendKeys(findTestObject('DuomLe_Practice3_EX2-02/txtSearch'), Keys.chord(Keys.ENTER))

WebDriver driver = DriverFactory.getWebDriver()

def elecount = driver.findElement(By.xpath('//a[@class="product-name" and @itemprop="url"]')).size()

result = WebUI.getText(findTestObject('DuomLe_Practice3_EX3/Page_Search - My Store/lbl7Result'))

WebUI.verifyMatch( result, elecount + ' results have been found.', false)

