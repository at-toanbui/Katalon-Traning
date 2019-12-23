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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.setText(findTestObject('Lesson3/Page_My Store/txtSearch'), 'Dress')

WebUI.click(findTestObject('Object Repository/Lesson3/Page_My Store/button_Search'))

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dress&submit_search=')

WebUI.click(findTestObject('Lesson3/Page_Search - My Store/FirstItem'))

WebUI.click(findTestObject('Lesson3/Page_Printed Summer Dress - My Store/btnAddQuantity'))

WebUI.click(findTestObject('Lesson3/Page_Printed Summer Dress - My Store/ColorBlue'))

WebUI.click(findTestObject('Lesson3/Page_Printed Summer Dress - My Store/btnAddToCart'))

TotalCost = WebUI.getText(findTestObject('Lesson3/Page_Printed Summer Dress - My Store/Totalcost1'))

WebUI.click(findTestObject('Lesson3/Page_Printed Summer Dress - My Store/btnProceedToCheckout1'))

TotalItem = WebUI.getAttribute(findTestObject('Lesson3/Page_Order - My Store/VerifyNumberItem'), 'value')

WebUI.verifyMatch(TotalItem, '2', true)

TotalCost2 = WebUI.getText(findTestObject('Lesson3/Page_Order - My Store/TotalCost2'))

WebUI.verifyMatch(TotalCost, TotalCost2, false)

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/btnProceedToCheckout2'))

WebUI.setText(findTestObject('Lesson3/Page_Login - My Store/txtEmailEX02-02'), 'phuc.phan@asiantech.vn')

WebUI.setEncryptedText(findTestObject('Lesson3/Page_Login - My Store/txtPasswordEX02-02'), 'N9JRvqZJrnMQQAsoy5xUJQ==')

WebUI.click(findTestObject('Lesson3/Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/chkDeliveryAddress'))

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/btnProceedToCheckout3'))

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/chkTermOfService'))

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/btnProceedToCheckout4'))

WebUI.click(findTestObject('Lesson3/Page_Order - My Store/btnPayByCheck'))

WebUI.click(findTestObject('Lesson3/Page_My Store/btnConfirmMyOrder'))

WebUI.verifyElementPresent(findTestObject('Lesson3/Page_Order confirmation - My Store/Message'), 2)

WebUI.closeBrowser()

