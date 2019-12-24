import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.setText(findTestObject('Lesson3/Ex03 Searching/Page_My Store/txtSearch'), 'Dress')

WebUI.sendKeys(findTestObject('Lesson3/Ex03 Searching/Page_My Store/txtSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElements> elements = driver.findElements(By.xpath('//a[@class="product-name" and @itemprop="url"]'))

for (int i=0; i < elements; i++) {
	 def text = elements.get(i).getText()
	 }

/** def ListArray = []

for (int i = 0; i < elements.size(); i++) {
    def text = elements.get(i).getText()

    println(text)

    ListArray << text

    WebUI.verifyMatch(text, '.*Dress.*', true)
} */

