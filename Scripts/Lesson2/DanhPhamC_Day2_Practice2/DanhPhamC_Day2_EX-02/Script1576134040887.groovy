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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://cms.demo.katalon.com/')

WebUI.setText(findTestObject('Lesson2/DanhPhamC_Day2_Practice2/DanhPhamC_Day2_EX-02/Page_Katalon Shop  Katalon Ecommerce/cboSearchContent'), 
    'Woo Single #2')

WebUI.sendKeys(findTestObject('Lesson2/DanhPhamC_Day2_Practice2/DanhPhamC_Day2_EX-02/Page_Katalon Shop  Katalon Ecommerce/cboSearchContent'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Lesson2/DanhPhamC_Day2_Practice2/DanhPhamC_Day2_EX-02/Page_Search Results for Woo Single 2  Katalon Shop/lblSearchResults'), 
    0)

WebUI.click(findTestObject('Lesson2/DanhPhamC_Day2_Practice2/DanhPhamC_Day2_EX-02/Page_Search Results for Woo Single 2  Katalon Shop/imgWooSingle2'))

title = WebUI.getWindowTitle()

//title.contains('Woo Single #2 – Katalon Shop')

WebUI.verifyMatch(title, '^Woo Single #2 – Katalon Shop.*', true)

WebUI.closeBrowser()

